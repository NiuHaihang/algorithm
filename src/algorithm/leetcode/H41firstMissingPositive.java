package algorithm.leetcode;

import java.util.Arrays;

public class H41firstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		int len=nums.length;
		if(len==0) return 1;
		System.out.println("len="+len);
		for(int i=0;i<len;i++) {
			while(nums[i]>0&&nums[i]<len&&nums[i]!=nums[nums[i]])
				swap(nums,i,nums[i]);
		}
		System.out.println(Arrays.toString(nums));
		for(int i=1;i<len;i++) {
			if(nums[i]!=i)
				return i;
		}
		if(nums[0]==len) return len+1;
		return len;
	}
	public void swap(int[] nums,int a,int b) {
		int temp=nums[a];
		nums[a]=nums[b];
		nums[b]=temp;
		
	}
	public static void main(String[] args) {
		H41firstMissingPositive res=new H41firstMissingPositive();
		int[] nums= {3,4,-1,1};
		int ans=res.firstMissingPositive(nums);
		System.out.println(ans);
	}
}
