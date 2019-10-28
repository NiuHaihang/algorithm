package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L39combinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res,candidates,0,target,temp);
        return res;
    }
	
	public void backtrack(List<List<Integer>> res,int[] candidates,int start,int target,List<Integer> temp) {
		if(target<0) return;
		if(target==0) {
			res.add(new ArrayList<>(temp));
			return;
		}
		for(int i=start;i<candidates.length&&target>=candidates[i];i++) {
			temp.add(candidates[i]);
			backtrack(res,candidates,i,target-candidates[i], temp);
			temp.remove(temp.size()-1);
		}
	}

    
	public static void main(String[] args) {
		L39combinationSum combination=new L39combinationSum();
		int[] candidates= {2,3,5};
		List<List<Integer>> ans =combination.combinationSum(candidates, 8);
		System.out.println(ans.size());
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i).toString());
		}
	}
}

