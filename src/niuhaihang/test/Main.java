package niuhaihang.test;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		for(int j = 101; j < 2000; j++) {
			List<List<Integer>> res = process(j);
			System.out.println("j="+j+",\n"+res.size());
			for(int i = 0; i < res.size(); i++) {
				System.out.println(res.get(i).get(0)+" "+res.get(i).get(1));
			}
		}
//		List<List<Integer>> res = process(n);
//		System.out.println(res.size());
//		for(int i = 0; i < res.size(); i++) {
//			System.out.println(res.get(i).get(0)+" "+res.get(i).get(1));
//		}
	}
	public static boolean meet1(int n) {
		int r = n%10;
		n/=10;
		int m = n%10;
		n/=10;
		int l = n%10;
		if(l!=m&&l!=r&&m!=r) return true;
		return false;
	}
	public static boolean meet2(int n) {
		int r = n%10;
		n/=10;
		int m = n%10;
		n/=10;
		int l = n%10;
		if(m==r&&m!=l) return true;
		return false;
	}
	public static List<List<Integer>> process(int n){
		int mid = n/200*100;
		List<List<Integer>> ans = new ArrayList<>();
		for(int i = mid; i < mid+100; i++) {
			if(meet1(i)&&meet2(n-i)&&(i/100==(n-i)/100)&&(i%10)==((n-i)%10)) {
				List<Integer> tmp = new ArrayList<>();
				tmp.add(i);
				tmp.add(n-i);
				ans.add(tmp);
			}
		}
		return ans;
	}
}