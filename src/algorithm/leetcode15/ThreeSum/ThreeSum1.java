package algorithm.leetcode15.ThreeSum;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class ThreeSum1 {
	public static List<List<Integer>> threeSum(int[] nums) {
	Arrays.sort(nums);
    List<List<Integer>> ls = new ArrayList<>();
    if(nums.length<3 || nums[0] > 0 || nums[nums.length-1] < 0) return ls;
    
    for(int i = 0; i < nums.length - 2; i++) {//固定一个数nums[i]，找到这个数右边的满足两数之和为target = 0 - nums[i]的两个数
    	if( i == 0 || (i>0 && nums[i] !=nums[i-1])) {
    		int l = i+1, r = nums.length-1, target = 0 - nums[i];
    		while(l < r) {
    			if(nums[l] + nums[r] == target) {
    				ls.add(Arrays.asList(nums[i],nums[l],nums[r]));
    				++l;
    				--r;
    			while(nums[l] == nums[l-1]) ++l;
    			while(nums[r] == nums[r+1]) --r;
    			}
    			else if(nums[l] + nums[r] < target) {
    				++l;
    				while(nums[l] == nums[l-1]) ++l;
    			}
    			else if(nums[l] + nums[r] > target){
    				--r;
    				while(nums[r] == nums[r+1]) --r;
    			}
    		}
    	}
    }
    return ls;
}
	public static void main(String args[]) {
		int[] nums = {-7,2,1,10,9,-10,-5,4,13,-9,-4,6,11,-12,-6,-9,-6,-9,-11,-4,10,10,-3,-1,-4,-7,-12,-15,11,5,14,11,-7,-8,6,9,-2,9,-10,-12,-15,2,10,4,5,11,10,6,-13,6,-13,12,-7,-9,-12,4,-9,13,-4,10,4,-12,6,4,-5,-10,-2,0,14,4,4,6,13,-9,-5,-5,-13,12,-14,11,3,10,8,11,-13,4,-8,-7,2,4,10,13,7,2,2,9,-1,8,-5,-10,-3,6,3,-5,12,6,-3,6,3,-2,2,14,-7,-13,10,-13,-2,-12,-4,8,-1,13,6,-9,0,-14,-15,6,9};
		List<List<Integer>> LL =threeSum(nums);
		System.out.println(LL);
	}
}
