package algorithm.nowcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ZJ9 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String firstLine = sc.nextLine();
            int n = firstLine.charAt(0)-'0';
            int m = firstLine.charAt(2)-'0';
            int c = firstLine.charAt(4)-'0';
            //用一个map存储所有颜色及其出现的坐标.key:颜色,value:坐标
            Map<Integer,List<Integer>> colorMap = new HashMap<>();
            for(int i = 0; i < n; i++){
                String[] line = sc.nextLine().split(" ");
                //System.out.println(line.length);
                int num = Integer.parseInt(line[0]);
                for(int j = 1; j <= num; j++){
                    int color = Integer.parseInt(line[j]);
                    if(colorMap.containsKey(color)){
                        colorMap.get(color).add(i);
                    }else{
                        List<Integer> list = new ArrayList<>();
                        list.add(i);
                        colorMap.put(color,list);
                    }
                }
            }
            //System.out.println(colorMap.toString());
            int invalid = 0;
            int size = colorMap.size();
            for(int color : colorMap.keySet()){
                if(!isValid(color,colorMap,n,m)){
                    invalid++;
                }
            }
            System.out.println(invalid);
        }
        sc.close();
    }
    public static boolean isValid(int color,Map<Integer,List<Integer>> map,int n,int m){
        List<Integer> list = map.get(color);
        if(list == null || list.size() <= 1) return true;
        
        int len = list.size();
        for(int i = 1; i < len; i++){
            if(list.get(i) - list.get(i-1) < m){
                return false;
            }
        }
        if(list.get(0)+n-list.get(len-1) < m) return false;
        return true;
    }
}
