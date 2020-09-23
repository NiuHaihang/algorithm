package algorithm.leetcode;

public class WeeklyTest179generateTheString {
	public String generaterTheString(int n) {
		if(n==1) return "a";
		StringBuilder sb = new StringBuilder();
		if(n%2==0) {
			for(int i=1;i<n;i++) {
				sb.append('a');
			}
			sb.append('b');
		}
		if(n%2==1) {
			for(int i=1;i<=n;i++) {
				sb.append('a');
			}
		}
		return sb.toString();
	}
}
