package algorithm.leetcode;

public class M34SearchRange {
	public int[] searchRange(int[] nums,int target) {
		if(nums.length==0||nums==null) {
			return new int[] {-1,-1};
		}
		int low=0,high=nums.length-1;
		int l=-1,r=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(nums[mid]<=target) {
				if(nums[mid]==target) {
					r=mid;
				}
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		
		low=0;
		high=nums.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(nums[mid]>=target) {
				if(nums[mid]==target) {
					l=mid;
				}
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return new int[] {l,r};
	}
	
}
