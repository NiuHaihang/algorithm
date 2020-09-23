package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M46permute {
	 public List<List<Integer>> permute(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> ansList = new ArrayList<>();
	        List<Integer> tempList = new ArrayList<>();
	        for(int i:nums) {
	        	tempList.add(i);
	        }
	        ansList.add(tempList);
	        while(nextPermutation(nums)){
	            List<Integer> tempList1 = new ArrayList<>();
	            for(int i:nums) {
		        	tempList1.add(i);
		        }
	            ansList.add(tempList1);
	        }
	        return ansList;
	    }
	    public boolean nextPermutation(int[] nums) {
	        if(nums.length<=1) return false;
			int cur=nums.length-1;
			while(cur>=1&&nums[cur]<=nums[cur-1]) {
				cur--;
			}
			cur--;
	        if(cur==-1) {
				reverse(nums,0);
				return false;
			}
			int tail=nums.length-1;
			while(nums[tail]<=nums[cur]) {
				tail--;
			}
			int temp=nums[cur];
			nums[cur]=nums[tail];
			nums[tail]=temp;
			reverse(nums,cur+1);
	        return true;
	    }
	    public void reverse(int[] nums,int start) {
			int tail=nums.length-1;
			for(int i=start;i<=(start+nums.length-1)/2;i++) {
				int temp = nums[i];
				nums[i]=nums[tail];
				nums[tail]=temp;
				tail--;
			}
		}
}
