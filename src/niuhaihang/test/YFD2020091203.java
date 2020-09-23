package niuhaihang.test;

import java.util.*;
public class YFD2020091203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.valueOf(sc.nextLine());
		for(int i = 0; i < t; i++) {
			String[] line = sc.nextLine().split(" ");
			String s1 = line[0];
			String s2 = line[1];
			String s3 = line[2];
			int k = Integer.valueOf(line[3]);
			if(solve(s1,s2,s3,k)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
	public static boolean solve(String s1,String s2,String s3,int k) {
		if(k<0 || s1.length()+s2.length()!=s3.length()) {
			//System.out.println("1111");
			return false;
		}
		if(s1.equals("") && s2.equals("")&&s3.equals("")) {
			return true;
		}
		if(s1.equals("")) {
			return s3.equals(s2);
		}
		if(s2.equals("")) {
			return s1.equals(s3);
		}
		int len1 = prelen(s1,s3);
		int len2 = prelen(s2,s3);
		//System.out.println("s1="+s1+",s2="+s2+",s3="+s3+",len1="+len1+",len2="+len2);
		if(len1 == 0) {
			return solve(s1,s2.substring(len2),s3.substring(len2),k-1);
		}else if(len2 == 0) {
			return solve(s1.substring(len1),s2,s3.substring(len1),k-1);
		}else {
			return solve(s1,s2.substring(len2),s3.substring(len2),k-1) || solve(s1.substring(len1),s2,s3.substring(len1),k-1);
		}
	}
	public static int prelen(String a,String b) {
		int index = 0;
		while(index<a.length() && index<b.length()) {
			if(a.charAt(index)==b.charAt(index)) {
				index++;
			}else {
				break;
			}
		}
		return index;
	}
}
