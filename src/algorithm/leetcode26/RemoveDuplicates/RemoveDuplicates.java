package algorithm.leetcode26.RemoveDuplicates;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
		if(nums.length==0) return 0;
		if(nums.length==1) return 1;
		int i,j;
        for(i=0,j=0;i<nums.length&&j<nums.length-1;) {
        	if(nums[j]==nums[j+1]) {
        		j++;
        	}
        	else {
        		nums[i]=nums[j];
        		i++;
        		j++;
        	}
        }
       if(i>=1&&nums[i-1]!=nums[j]) {
    	   nums[i]=nums[j];
       }
        return i+1;
    }
	
	
	public static void main(String[] args) {
		int nums[]= {1};
		int ans=removeDuplicates(nums);
		System.out.println(ans);
	}
}
