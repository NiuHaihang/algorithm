package niuhaihang.test;

import java.util.Arrays;

public class BubbleSort {
	public void bubbleSort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			boolean exchange=false;
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					swap(nums,j,j+1);
					exchange=true;
				}
			}
			System.out.println("µÚ"+(i+1)+"ÂÖÅÅĞòºó£º"+Arrays.toString(nums));
			if(!exchange) return;
		}
	}
	public void swap(int[] nums,int a,int b) {
		int temp=nums[a];
		nums[a]=nums[b];
		nums[b]=temp;
	}
	public static void main(String[] args) {
		BubbleSort res=new BubbleSort();
		int[] nums= {3,9,1,4,2,7,8,6,5};
		res.bubbleSort(nums);
	}
}
