package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L39combinationSum2 {
	public List<List<Integer>> combinationSum(int[] candidates,int target){
		Arrays.sort(candidates);
		List<List<Integer>> anslist=new ArrayList<>();
		List<Integer> templist=new ArrayList<>();
		dfs(anslist,candidates,0,0,target,templist);
		return anslist;
	}
	public  void dfs(List<List<Integer>> anslist,int[] candidates,int start,int currentval,int target,List<Integer> templist){
		if(currentval>target) return;
		if(currentval==target) {
			List<Integer> temp=new ArrayList<Integer>(templist);
			anslist.add(temp);
			return;
		}
		int len=candidates.length;
		for(int i=start;i<len&&currentval+candidates[i]<=target;i++) {
			templist.add(candidates[i]);
			dfs(anslist,candidates,i,currentval+candidates[i],target,templist);
			templist.remove(templist.size()-1);
		}
	}
	public static void main(String[] args) {
		L39combinationSum2 combination=new L39combinationSum2();
		int[] candidates= {2,3,5};
		List<List<Integer>> ans =combination.combinationSum(candidates, 8);
		System.out.println(ans.size());
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i).toString());
		}
	}
}
