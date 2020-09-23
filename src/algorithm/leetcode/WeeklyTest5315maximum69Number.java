package algorithm.leetcode;

public class WeeklyTest5315maximum69Number {
	public int maximum69Number(int num) {
		String s = String.valueOf(num);
		StringBuilder sb = new StringBuilder();
		int i=0;
		for(i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='6') {
				sb.append('9');
				break;
			}else {
				sb.append(s.charAt(i));
			}
		}
		for(int j=i+1;j<s.length();j++) {
			sb.append(s.charAt(j));
			
		}
		return Integer.parseInt(sb.toString());
	}
}
