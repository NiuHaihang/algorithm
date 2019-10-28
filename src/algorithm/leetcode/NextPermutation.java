package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
		if(nums.length==0) return;
		int n=nums.length;
		int[] P=nums.clone();
		Arrays.sort(P);
		permutation(P,nums,1,n);
	}
	public void permutation(int[] P,int[] A,int cur,int n) {
		if(cur==n-1) {
			for(int i=0;i<n;i++) {
				System.out.print(A[i]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		else for(int i=1;i<n;i++)
			if(i==1 || P[i]!=P[i-1]) {
				int temp1=0,temp2=0;
				for(int j=0;j<cur;j++) if(A[j]==P[i]) temp1++;
				for(int j=0;j<n;j++) if(P[j]==P[i]) temp2++;
				if(temp1<temp2) {
					A[cur]=P[i];
					permutation(P,A,cur+1,n);
				}
			}
	}
	
	public static void main(String[] args) {
		int[] nums= {1,3,2};
		NextPermutation p=new NextPermutation();
		p.nextPermutation(nums);
	}
}
