package niuhaihang.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Permute {
	List<List<Integer>> ansList = new LinkedList();
	public List<List<Integer>> permute(int[] nums){
		List<Integer> list = new LinkedList();
		Set<Integer> track = new HashSet();
		dfs(nums,list,track);
		return ansList;
	}
	public void dfs(int[] nums,List<Integer> list,Set<Integer> track) {
		if(list.size() == nums.length) {
			ansList.add(new LinkedList(list));
			return;
		}
		for(int i : nums) {
			if(track.contains(i)) {
				continue;
			}
			list.add(i);
			track.add(i);
			dfs(nums,list,track);
			track.remove(i);
			list.remove(list.size()-1);
		}
	}
	public static void main(String[] args) {
		Permute res = new Permute();
		int[] nums = {4,8,6,9,7,2};
		List<List<Integer>> ans = res.permute(nums);
		System.out.println(ans.size());
		System.out.println(ans.toString());
	}
}
