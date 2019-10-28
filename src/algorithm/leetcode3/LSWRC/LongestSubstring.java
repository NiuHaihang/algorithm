package algorithm.leetcode3.LSWRC;

public class LongestSubstring {
	public int lenthOfLongestSubstring(String s) {
		if(s.length()==0) return 0;
		if(s.length()==1) return 1;
		int maxlen=1;
		int len = s.length();
		
		for(int i=0;i<len;i++) {
			StringBuilder sb=new StringBuilder();
			sb.append(s.charAt(i));
			for(int j=i+1;j<len;j++) {
				if(sb.indexOf(""+s.charAt(j))!=-1) {
					break;
				}
				else {
					sb.append(s.charAt(j));
				}
			}
			maxlen = Math.max(maxlen, sb.length());
		}
		
		return maxlen;
	}
}
