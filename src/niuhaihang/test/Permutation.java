package niuhaihang.test;

import java.util.Arrays;

public class Permutation {
	int cnt = 0;
	public void permutation(int[] nums) {
		int[] P=nums.clone();
		Arrays.sort(P);
		int len=nums.length;
		print_permutation(P,nums,0,len);
	}
	public void print_permutation(int[] P,int[] A,int cur,int n) {
		if(cur==n) {
			cnt++;
			System.out.println("--------------");
			for(int i=0;i<n;i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println("\n");
		}

			for(int i=0;i<n;i++)
				if(i==0||P[i]!=P[i-1]){
					int temp1=0;
					int temp2=0;
					for(int j=0;j<cur;j++) {
						if(A[j]==P[i]) temp1++;
					}
					for(int j=0;j<n;j++) {
						if(P[j]==P[i]) temp2++;
					}
					if(temp1<temp2) {
						A[cur]=P[i];
						print_permutation(P,A,cur+1,n);
					}
				}
		
	}
	
	public static void main(String[] args) {
		int[] a= {4,8,6,9,7,2};
		Permutation p=new Permutation();
		p.permutation(a);
		System.out.println(p.cnt);
	}
}
