package niuhaihang.test;

import java.util.*;
public class netEasy01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			long p = sc.nextLong();
			long q = sc.nextLong();
			int res = solve(A,B,p,q);
			System.out.println(res);
		}
	}
	public static int solve(int A,int B,long p,long q) {
		if(A+p>=B) return 1;
		long diff = B-A;
		int cnt = 1;
		while(p<diff) {
			p = p*q;
		
			cnt++;
			//System.out.println("cnt="+cnt+",cur="+cur+",p="+p);
		}
		return cnt;
	}
}
