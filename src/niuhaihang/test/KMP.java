package niuhaihang.test;

import java.util.Arrays;

public class KMP {
	public int[] compute_next(String pattern) {
		int[] next = new int[pattern.length()];
		next[0] = -1;
//		for(int i = 2;i < pattern.length(); i++) {
//			for(int j = 1; j < i; j++) {
//				if(pattern.substring(0,j).equals(pattern.substring(i-j,i))) {
//					next[i] = j;
//				}
//			}
//		}
		int j = 0;
		int k =-1;
		while(j<pattern.length()-1) {
			if(k == -1 || pattern.charAt(j)==pattern.charAt(k)) {
				next[++j]=++k;
			}else {
				k = next[k];
			}
		}
		System.out.println(Arrays.toString(next));
		return next;
	}
	public int kmp(String str,String pattern) {
		int[] next = compute_next(pattern);
		int i = 0;
		int j = 0;
		while(i<str.length()) {
			if(str.charAt(i)!=pattern.charAt(j)) {
				j = next[j];
				if(j == -1) {
					i++;
					j = 0;
				}
			}else {
				i++;
				j++;
				if(j == pattern.length()) {
					return i-j;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		KMP res = new KMP();
		int ans = res.kmp("bbc abcdab abcdabcdabde", "abcdabd");
		System.out.println(ans);
	}
}
