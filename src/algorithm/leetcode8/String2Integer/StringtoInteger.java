package algorithm.leetcode8.String2Integer;

public class StringtoInteger {
	public static int myAtoi(String str) {
		int l = str.length();
		long ans = 0;
		if(l == 0 || str == null) return 0;
		str = str.trim();
		if(str.length() == 0 || str == null || (str.length()==1 && !Character.isDigit(str.charAt(0)))) return 0;
		//System.out.println(str);
		
		if (str.charAt(0) == '-') {
			for(int j = 1; j < str.length(); j++) {
				int m = str.charAt(j) - '0';
				if(m < 0 || m > 9) break;
				ans = 10*ans - m;
				if(ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
				
				
		}
		}
		else  if(str.charAt(0) == '+') {
			for(int i = 1; i < str.length(); i++) {
				int m = str.charAt(i) - '0';
				if(m < 0 || m > 9) break;
				ans = 10*ans + m;
				if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
				
			}
		}
		else if(Character.isDigit(str.charAt(0))) {
			for(int i = 0; i < str.length(); i++) {
				int m = str.charAt(i) - '0';
				if(m < 0 || m > 9) break;
				ans = 10*ans + m;
				if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
				
			}
		}
		else {
			ans = 0;
		}
		
	
		return (int)ans;
	}
	
	public static void main(String args[]) {
	/*	int m = 1<<31;
		int n = 1<<2;
		int o = (1<<31)-1;
		System.out.println(m+","+n+","+o);*/
		String s = "2147483648";
		int ans = myAtoi(s);
		System.out.println(ans);
	}
}
