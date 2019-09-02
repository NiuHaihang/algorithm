package algorithm.leetcode3.LSWRC;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class Solution {
	public static int lengthOfLogestSubstring(String s) {
		int maxl = 0;
		int l = s.length();
	
		
		for(int i=0;i<l;i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(i));
			System.out.println(s);
			//System.out.println(sb);
			for(int j=i+1;j<l;j++) {
				if(sb.indexOf(""+s.charAt(j))!=-1) {
					break;
				}
				else
				{
					sb.append(s.charAt(j));
				}
			}
			System.out.println(sb);
			maxl = (maxl>sb.length())?maxl:sb.length();
		}
		
		return maxl;
	}
	
	public static void main(String args[]) {
		String s = new String("abcabcbb");
		int a = lengthOfLogestSubstring(s);
		System.out.println(a);
	}
}
