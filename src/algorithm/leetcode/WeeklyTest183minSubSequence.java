package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeeklyTest183minSubSequence {
	public List<Integer> minSubSequence(int[] nums){
		Arrays.sort(nums);
		List<Integer> ansList = new ArrayList();
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		int tempsum=0;
		for(int i=nums.length-1;i>=0;i--) {
			tempsum+=nums[i];
			if(tempsum<=sum/2){
				ansList.add(nums[i]);
			}
			else {
				ansList.add(nums[i]);
				break;
			}
		}
		return ansList;
	}
}
