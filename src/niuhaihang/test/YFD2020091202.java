package niuhaihang.test;

import java.util.*;
public class YFD2020091202 {
	static int mod = 10000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.valueOf(sc.nextLine());
		for(int i = 0; i < t; i++) {
			String line = sc.nextLine().trim();
			//括号不匹配
			if(line.charAt(0)!='(' || line.charAt(line.length()-1)!=')') {
				System.out.println("invalid");
				continue;
			}
			String s = line.substring(1,line.length()-1).trim();
			if(s.charAt(0)!='+'&&s.charAt(0)!='-'&&s.charAt(0)!='*') {
				System.out.println("invalid");
				continue;
			}
			int res = solve(s);
			System.out.println(res);
		}
	}
	public static int solve(String s) {
		String substr = s.substring(1).trim();
		return 1;
	}
}
