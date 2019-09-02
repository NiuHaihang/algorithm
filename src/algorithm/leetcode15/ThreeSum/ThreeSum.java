package algorithm.leetcode15.ThreeSum;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;

//超时了
public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums){
		
		List<List<Integer>> LL =new ArrayList<List<Integer>>(); 
		if(nums.length < 3) return LL;
		//quickSort(nums, 0, nums.length-1);// 	Arrays自带sort方法
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		int l = 0, r = nums.length-1;
		int l1 = 0, r1 = 0;
		if(nums[0] > 0 || nums[nums.length -1] < 0) return LL;

		
		for(int i = 0; i < nums.length; i++) {
			if(nums[0] == 0) {
				l = 0;
				l1 = 0;
				continue;
			}
			if(nums[i] >= 0) {
				l = i-1;
				if(nums[i] == 0) l1 = i;
				
				break;
			}
		}
		for(int j = nums.length-1; j >= 0; j--) {
			if(nums[j] <= 0) {
				r = j+1;
				if(nums[j] == 0) r1 = j;
				break;
			}
		}
		
		
		System.out.println(l+","+r);
		System.out.println(l1+","+r1);
		for(int i = 0; i <= l; i++) {
			for(int j = r; j < nums.length; j++) {
				for(int k = j+1; k < nums.length; k++) {
					if(nums[i] + nums[j] + nums[k] > 0) break;
					if(nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> L =new ArrayList<Integer>();
						L.add(nums[i]);
						L.add(nums[j]);
						L.add(nums[k]);
						LL.add(L);
					}
				}
			}
		}
		for(int i = 0; i <= l; i++) {
			for(int j = i + 1; j <= l;j++) {
				for(int k = r; k < nums.length; k++) {
					if(nums[i] + nums[j] + nums[k] > 0) break;
					if(nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> L =new ArrayList<Integer>();
						L.add(nums[i]);
						L.add(nums[j]);
						L.add(nums[k]);
						LL.add(L);
					}
				}
			}
		}
		
		if(r1 - l1 >=2) {
			List<Integer> L =new ArrayList<Integer>();
			L.add(0);
			L.add(0);
			L.add(0);
			LL.add(L);
		}

		if(r - l > 1) {
			for(int i = 0; i <= l;i++) {
				for(int j = r; j < nums.length; j ++) {
					if(Math.abs(nums[j]) > Math.abs(nums[i])) break;
					if(nums[i] + nums[j] == 0) {
						List<Integer> L =new ArrayList<Integer>();
						L.add(nums[i]);
						L.add(0);
						L.add(nums[j]);
						LL.add(L);
					}
				}
			}
		}
		for(int i = 0; i < LL.size()-1; i++) {
			for(int j = LL.size()-1; j>i; j--) {
				if(LL.get(j).equals(LL.get(i))) {
					LL.remove(j);
				}
			}
		}
		return LL;
	}
	
	public static void quickSort(int[] nums,int low,int high) {
		if(low < high) {
			int pos = partition(nums,low,high);
			quickSort(nums, low, pos-1);
			quickSort(nums, pos+1, high);
		}
	}
	
	public static int partition(int[] nums,int low,int high) {
		int pos = low;
		int temp = nums[pos];
		while(low < high) {
			while(low < high && nums[high] >= temp) --high;
			nums[low] = nums[high];
			while(low < high && nums[low] <= temp) ++low;
			nums[high] = nums[low];
		}
		nums[low] = temp;
		return low;
		
	}
	
	public static void main(String args[]) {
		int[] nums = {-7,2,1,10,9,-10,-5,4,13,-9,-4,6,11,-12,-6,-9,-6,-9,-11,-4,10,10,-3,-1,-4,-7,-12,-15,11,5,14,11,-7,-8,6,9,-2,9,-10,-12,-15,2,10,4,5,11,10,6,-13,6,-13,12,-7,-9,-12,4,-9,13,-4,10,4,-12,6,4,-5,-10,-2,0,14,4,4,6,13,-9,-5,-5,-13,12,-14,11,3,10,8,11,-13,4,-8,-7,2,4,10,13,7,2,2,9,-1,8,-5,-10,-3,6,3,-5,12,6,-3,6,3,-2,2,14,-7,-13,10,-13,-2,-12,-4,8,-1,13,6,-9,0,-14,-15,6,9};
		List<List<Integer>> LL =threeSum(nums);
		System.out.println(LL);
	}
}
