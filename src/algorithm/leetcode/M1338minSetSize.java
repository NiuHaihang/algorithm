package algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class M1338minSetSize {
	public int minSetSize(int[] arr) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i< arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				int temp = map.get(arr[i]);
				map.put(arr[i], temp+1);
			}
		}
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		int[] nums = new int[map.size()];
		int i = 0;
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> entry = it.next();
			nums[i] = entry.getValue();
			i++;
		}
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int sum = 0;
		int count = 0;
		int index = nums.length-1;
		while(sum < arr.length/2) {
			sum += nums[index--];
			count++;
		}
		return count;
    }
	
	public static void main(String[] args) {
		M1338minSetSize res = new M1338minSetSize();
		int[] arr = {9,77,63,22,92,9,14,54,8,38,18,19,38,68,58,19};
		int ans = res.minSetSize(arr);
		System.out.println(ans);
	}
}
