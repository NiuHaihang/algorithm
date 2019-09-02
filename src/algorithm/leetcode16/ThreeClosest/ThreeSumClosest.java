package algorithm.leetcode16.ThreeClosest;

import java.util.Arrays;

public class ThreeSumClosest {
	@SuppressWarnings("null")
	public static int threeSumClosest(int[] nums,int target) {
		
		int len = nums.length;
		if(len < 3) return (Integer) null;
		Arrays.sort(nums);
		for(int i:nums) {
			System.out.println(i);
		}
		int ans = nums[0]+nums[1]+nums[2];
				
		for(int i = 0; i < len-2;i++) {
			int l = i+1, r = len-1;
			while(l<r) {
				int temp = nums[i]+nums[l]+nums[r];
				if(Math.abs(temp - target) < Math.abs(ans - target)) {
					ans = temp;
					System.out.println(ans);
				}
				if(temp < target) l++;
				else if(temp > target) r--;
				else return target;
			}
			
		}
		
		
		return ans;
	}
	
	
	
	public static void main(String args[]) {
		int[] a = {1,1,-1,-1,3};
		int ans = threeSumClosest(a, 3);
		System.out.println(ans);
	}
}
