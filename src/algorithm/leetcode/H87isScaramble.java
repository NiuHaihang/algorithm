package algorithm.leetcode;

import java.util.Arrays;

public class H87isScaramble {
	public boolean isScramble(String s1, String s2) {
		if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;
        
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();
        Arrays.sort(s1Char);
        Arrays.sort(s2Char);
        System.out.println(Arrays.toString(s1Char));
        System.out.println(Arrays.toString(s2Char));
        //System.out.println("heheh");
        for(int i = 0; i < s1.length(); i++){
            if(s1Char[i] != s2Char[i]) return false;
        }
        	
        System.out.println("hahah ");
        for(int i = 1; i < s1.length(); i++){
        	boolean flag1 = isScramble(s1.substring(0,i),s2.substring(0,i)) && isScramble(s1.substring(i),s2.substring(i));
        	
        	if(flag1) return true;
        	
        	boolean flag2 = isScramble(s1.substring(0,i),s2.substring(s2.length()-i)) && isScramble(s1.substring(i),s2.substring(0,i));
        	
        	if(flag2) return true;

        }
        return false;
    }
	
	public static void main(String[] args) {
		H87isScaramble res = new H87isScaramble();
		if(res.isScramble("abcde", "caebd")) System.out.println("__________"); 
	}
}
