package niuhaihang.test;

public class MergeSort1 {
	public int[] mergeSort(int[] nums) {
		mergeSort(nums,0,nums.length-1);
		return nums;
	}
	public static void mergeSort(int[] nums,int left,int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(nums,left,mid);
			mergeSort(nums,mid+1,right);
			merge(nums,left,mid,right);
		}
	}
	public static void merge(int[] nums,int low,int mid,int high) {
		int[] temp = new int[high-low+1];
		int l1 = low,r1=mid+1;
		int index=0;
		while(l1<=mid&&r1<=high) {
			if(nums[l1]<nums[r1]) {
				temp[index++]=nums[l1];
				l1++;
			}else {
				temp[index++]=nums[r1++];
			}
		}
		while(l1<=mid) {
			temp[index++] = nums[l1++];
		}
		while(r1<=high) {
			temp[index++] = nums[r1++];
		}
		for(int i = 0; i < temp.length; i++) {
			nums[low+i] = temp[i];
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,3,2,7,4,6,5,8,0,9};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
