package algorithm.leetcode5.LongestPalindromicSubstring;

public class LongestPalindromicSubstringDP {
	public static String longestPalindromicSubStringDP(String s) {
		if(s.isEmpty()) return s;
		int l = s.length();
		boolean dp[][] =new boolean[l][l];
		int left = 0,right = 0;
		for(int i = l - 1; i >= 0; i--) {
			dp[i][i] = true;
			for(int j = i + 1; j < l; j++) {
				dp[i][j] = (s.charAt(i) == s.charAt(j)) && ((j - i <3) || dp[i+1][j-1]);
				if(dp[i][j]&&(j - i > right - left)) {
					right = j;
					left = i;
				}
			}
			
		}
		return s.substring(left, right+1);
	}
	
	public static void main(String args[]) {
		String s = new String("cbbd");
		String ans = longestPalindromicSubStringDP(s);
		System.out.println(ans);
	}
}
