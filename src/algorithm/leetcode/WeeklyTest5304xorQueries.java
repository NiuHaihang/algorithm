package algorithm.leetcode;

import java.util.Arrays;

public class WeeklyTest5304xorQueries {
	public int[] xorQueries(int[] arr,int[][] queries) {
		int[] ans = new int[queries.length];
		for(int i=0;i<queries.length;i++) {
			int start=queries[i][0];
			int end=queries[i][1];
			if(start==end) {
				ans[i]=arr[start];
			}else {
				int temp=arr[start];
				for(int j=start+1;j<=end;j++) {
					temp^=arr[j];
				}
				ans[i]=temp;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		WeeklyTest5304xorQueries res = new WeeklyTest5304xorQueries();
		int[] arr = {4,8,2,10};
		int[][] queries = {{2,3},{1,3},{0,0},{0,3}};
		int[] ans=res.xorQueries(arr, queries);
		System.out.println(Arrays.toString(ans));
	}
}
