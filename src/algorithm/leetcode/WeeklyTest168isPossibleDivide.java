package algorithm.leetcode;

import java.util.Arrays;

public class WeeklyTest168isPossibleDivide {
	public boolean isPossibleDivide(int[] nums,int k) {
		if(nums.length%k != 0) return false;
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		boolean[] visited = new boolean[nums.length];
		int end=nums.length-1;
		for(int i=0;i<=end;i++) {
			System.out.println("nums["+i+"]="+nums[i]);
			if(visited[i]) {
				continue;
			}
			int temp=nums[i];
			int cnt=k-1;
			for(int j=i+1;j<=end;j++) {
				System.out.println("j="+j+";cnt="+cnt+";temp="+temp);
				if(visited[j]) continue;
				if(cnt==0) break;
				if(nums[j]-temp==1) {
					visited[j]=true;
					temp=nums[j];
					cnt--;
				}
				//else if(nums[j]==temp) continue;
				else if(nums[j]-temp>1) return false;
			}
			if(cnt!=0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		WeeklyTest168isPossibleDivide res = new WeeklyTest168isPossibleDivide();
		int[] nums= {3,3,2,2,1,1};
		int k=3;
		if(res.isPossibleDivide(nums, k)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
