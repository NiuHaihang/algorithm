package algorithm.leetcode3.LSWRC;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {
	public int lenthOfLongestSubString(String s) {
		int len = s.length();
		int ans=0;
		int j;
		for(int i=0;i<len;) {
			Set<Character> set = new HashSet<>();
			for(j=i;j<len;j++) {
				if(!set.contains(s.charAt(j))) {
					set.add(s.charAt(j));
				}else {
					break;
				}
			}
			ans=Math.max(ans, j-i);
			i=j;
		}
		return ans;
	}
	public static void main(String[] args) {
		LengthOfLongestSubString res = new LengthOfLongestSubString();
		int ans=res.lenthOfLongestSubString("dvdf");
		System.out.println(ans);
	}
}
