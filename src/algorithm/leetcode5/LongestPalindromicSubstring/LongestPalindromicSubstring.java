package algorithm.leetcode5.LongestPalindromicSubstring;




public class LongestPalindromicSubstring {
		public static String longestPalindrome(String s) {
			StringBuilder sb = new StringBuilder("$#");
			for(int i = 0; i < s.length(); i++) {
				sb.append(s.charAt(i));
				sb.append("#");
			}
			int p[] = new int[sb.length()];
			int mx = 0, id = 0, resLen = 0, resCenter = 0;//resLen是待求回文子串的半径，resCenter是待求回文子串的中心位置
			for(int j = 1; j < sb.length(); j++) {
				p[j] = mx > j ? Math.min(p[2 * id - j], mx - j) : 1;
				while(((j + p[j]) < sb.length()) && ((j - p[j]) >= 0) && (sb.charAt(j + p[j]) == sb.charAt(j - p[j]))) ++p[j];
				if(mx < j + p[j]) {
					mx = j + p[j];
					id = j;
				}
				if(resLen < p[j]) {
					resLen = p[j];
					resCenter = j;
				}
	 		}
			System.out.println(resCenter+" "+resLen);
			int stt = (resCenter-resLen)/2;
			int edd = stt + resLen-1;
			return s.substring(stt, edd);	
		}
		
		public static void main(String args[]) {
			//String s= "cbbd";
			String s = "abcdbbfcba";
			String ans = longestPalindrome(s);
			System.out.println(ans);
		}
}
