package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class H76minWindow {
	public String minWindow(String s, String t) {
        Map<Character,Integer> tmap = new HashMap();
        char[] tchar = t.toCharArray();
        char[] schar = s.toCharArray();
        for(int i = 0; i < t.length();i++){
            tmap.put(tchar[i],tmap.getOrDefault(tchar[i],0)+1);
        }
        //System.out.println(tmap.toString());
        Map<Character,Integer> window = new HashMap();
        int size = 0;
        int left = 0,right = 0;
        String ans = "";
        int len = Integer.MAX_VALUE;
        
        while(right < s.length()){
            window.put(schar[right],window.getOrDefault(schar[right],0)+1);
            int l = window.get(schar[right]);
            int r = tmap.get(schar[right]);
            //System.out.println(window.toString());
            if(l == r){
                //System.out.println("heihei");
                size++;
            }
            while(size == tmap.size()){
               // System.out.println("heiehei");
                if(right - left + 1 > 0 && right - left + 1 < len){
                    //System.out.println("HHHH");
                    //System.out.println("left="+left+",   right="+right);
                    ans = s.substring(left,right+1);
                    len = right - left + 1;
                }
                if(left < s.length()){
                    char c = schar[left];
                    if(tmap.containsKey(c)){
                        if(window.get(c) == tmap.get(c)){
                        size--;
                        }
                        window.put(c,window.get(c)-1);
                        }
                    left++;
                }
                
            }
            right++;
        }
        //System.out.println("tmap.size()="+tmap.size()+",size="+size);
        //System.out.println(window.toString());
        return ans;
    }
	
}
