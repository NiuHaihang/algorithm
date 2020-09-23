package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class M990equationsPossible {
	Map<String,String> map = new HashMap();
    int cnt;
    public boolean equationsPossible(String[] equations) {
        int len = equations.length;
        if(len == 0) return false;
        for(int i = 0; i < len; i++){//初始化pre[]
            if(!map.containsKey(equations[i].substring(0,1))){
                map.put(equations[i].substring(0,1),equations[i].substring(0,1));
            }
            if(!map.containsKey(equations[i].substring(3,4))){
                map.put(equations[i].substring(3,4),equations[i].substring(3,4));
            }
        }
        for(int i = 0; i < len; i++){//先处理等于的情况
            if(equations[i].charAt(1) == '='){
                String a = find(equations[i].charAt(0)+"");
                String b = find(equations[i].charAt(3)+"");
                if(!a.equals(b)){
                    union(a,b);
                }
            }
        }
        for(int i = 0; i < len; i++){//在处理不等于
            if(equations[i].charAt(1) == '!'){
                String a = find(equations[i].charAt(0)+"");
                String b = find(equations[i].charAt(3)+"");
                if(a.equals(b)){
                    return false;
                }
            }
        }
        return true;
    }
    public String find(String root){
        String temp,son;
        son = root;
        while(!root.equals(map.get(root))){
            root = map.get(root);
        }
        while(!son.equals(root)){
            temp = map.get(son);
            map.put(son,root);
            son = temp;
        }
        return root;
    }
    public void union(String a,String b){
        String x = find(a);
        String y = find(b);

        if(!x.equals(y)){
            map.put(x,y);//pre[x] = y
        }
    }
    public static void main(String[] args) {
    	M990equationsPossible res = new M990equationsPossible();
    	String[] equations = {"c==c","b==d","x!=z"};
    	if(res.equationsPossible(equations)) {
    		System.out.println("heh");
    	}
    	
    }
}
