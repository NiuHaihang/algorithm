package algorithm.leetcode1.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TwoSum {
	/*public static int[] twoSum(int[] nums, int target) {
		Arrays.sort(nums);
		for(int i:nums) {
			System.out.println(i);
		}
		int[] ans = new int[2];
		//int l=0,r=0;
		if(nums[0] >= target) return ans;
		for(int i = 0; i < nums.length; i++) {
			System.out.println("heheeh");
			for(int j = i+1; j<nums.length; j++) {
				System.out.println("hahahh");
				if(nums[i] + nums[j] == target) {
					//l=i;r=j;ans[0] = l;ans[r] = r;
					ans[0] = i; ans[1] =j;
					System.out.println(nums[i]+","+nums[j]);
					break;
				}
			}
		}
		return ans;*/
		public static int[] twoSum(int[] nums, int target) {
	         
	        int complement;
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<nums.length;i++){
	            complement = target - nums[i];
	            if(map.containsKey(complement)){
	                return new int[]{map.get(complement),i};
	            }
	            map.put(nums[i],i);
	            
	        }
	        Iterator<Map.Entry<Integer, Integer>> iterator1 = map.entrySet().iterator();
	        Map.Entry<Integer, Integer> entry;
	        while(iterator1.hasNext()) {
	        	entry = iterator1.next();
	        	System.out.println(entry.getKey());
	        	System.out.println(entry.getValue());
	        	
	        }
	        return null;
	    }

	
	public static void main(String args[]) {
		int[] a = {3,2,4};
		int ans[] = twoSum(a, 6);
		for(int i:ans) {
			System.out.println(i);
		}
	}
}
 