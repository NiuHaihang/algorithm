package algorithm.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class M1202smallestStringWithSwap {
	Map<Integer,Character> alphabetMap = new HashMap();
    Map<Integer,List<Character>> indexMap = new HashMap();
    int[] pre;

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int len = s.length();
        if(len == 1) return s;
        initMap(alphabetMap,s);
        System.out.println(alphabetMap.toString());
        pre = new int[len];
        char[] midAns = new char[len];
        for(int i = 0; i < len; i++){
            pre[i] = i;
        }
        for(int i = 0; i < pairs.size(); i++){
            int m = pairs.get(i).get(0);
            int n = pairs.get(i).get(1);
            int x = find(m);
            int y = find(n);
            //if(x != y) union(m,n);
            union(m,n);
        }
        for(int i = 0; i < len; i++) {
        	find(i);
        }
        System.out.println(Arrays.toString(pre));
        for(int i = 0; i < len; i++){
            if(!indexMap.containsKey(pre[i])){//pre[i]是第i个字母的掌门人,将掌门人领导的弟子划分到一个门派里
                List<Character> tempList = new LinkedList();
                tempList.add(alphabetMap.get(i));
                indexMap.put(pre[i],tempList);//掌门人先放进去
            }else{
                indexMap.get(pre[i]).add(alphabetMap.get(i));//弟子放进去
            }
        }
        System.out.println(indexMap.toString());
        //接下来对每个门派内部单独排序
        // for(Map.Entry<Integer,List<Character>> entry : indexMap.entrySet()){
        //     List<Character> charList = entry.getValue();
        //     Collections.sort(charList);
        //     int index = 0;
        //     int zhangmen = entry.getKey();
        //     for(int i = 0; i < len; i++){
        //         if(pre[i] == zhangmen){
        //             midAns[i] = charList.get(index++);
        //         }
        //     }
        // }
        Set<Integer> visited = new HashSet();
        for(int i = 0; i < len; i++){
            if(visited.contains(pre[i])) continue;
            else{
                List<Character> tempList = indexMap.get(pre[i]);
                Collections.sort(tempList);
                int index = 0;
                for(int j = i; j < len; j++){
                    if(pre[j] == pre[i]){
                        midAns[j] = tempList.get(index++);
                    }
                }
                visited.add(pre[i]);
            }
        }
        return String.valueOf(midAns);
    }
    public int find(int root){
        int temp,son;
        son = root;
        while(root != pre[root]){
            root = pre[root];
        }
        while(son != root){
            temp = pre[son];
            pre[son] = root;
            son = temp;
        }
        return root;
    }
    public void union(int a,int b){
        int x = find(a);
        int y = find(b);
        if(x != y){
            pre[x] = y;
        }
    }
    public void initMap(Map<Integer,Character> map,String s){
        for(int i = 0;i < s.length(); i++){
            map.put(i,s.charAt(i));
        }
    }
    public static void main(String[] args) {
    	M1202smallestStringWithSwap res = new M1202smallestStringWithSwap();
    	String s = "dcab";
    	int[][] a = {{0,3},{1,2},{2,0}};
    	List<List<Integer>> pairs = new LinkedList();
    	LinkedList<Integer> l1 = new LinkedList() {{add(0);add(3);}};
    	LinkedList<Integer> l2 = new LinkedList() {{add(1);add(2);}};
    	LinkedList<Integer> l3 = new LinkedList() {{add(2);add(0);}};
    	pairs.add(l1);pairs.add(l2);pairs.add(l3);
    	String  ans = res.smallestStringWithSwaps(s, pairs);
    	System.out.println(ans);
    	
    }
}
