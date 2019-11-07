package algorithm.leetcode;

public class M33SearchSpanningArray {
	public int search(int[] nums,int target) {
		if(nums.length==0) return -1;
		return search(nums,0,nums.length-1,target);
	}
	public int search(int[] nums,int left,int right,int target) {
		if(left>right) return -1;
		int mid=(left+right)/2;
		if(nums[mid]==target) return mid;
		if(nums[mid]<nums[right]) {
			if(nums[mid]<target&&target<=nums[right])
				return search(nums,mid+1,right,target);
			else
				return search(nums,left,mid-1,target);
		}else {
			if(nums[left]<=target&&target<nums[mid])
				return search(nums,left,mid-1,target);
			else
				return search(nums,mid+1,right,target);
		}
	}
	
	public static void main(String[] args) {
		int[] nums= {4,5,6,7,0,1,2};
		M33SearchSpanningArray ans=new M33SearchSpanningArray();
		int a=ans.search(nums,3);
		int b=ans.search(nums,7);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
