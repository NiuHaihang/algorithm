package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L40combinationSum2 {
	public List<List<Integer>> combinationSum(int[] candidates,int target){
		Arrays.sort(candidates);
		List<List<Integer>> anslist=new ArrayList<>();
		List<Integer> templist = new ArrayList<>();
		dfs(anslist,candidates,0,0,target,templist);
		
		return anslist;
	}
	public void dfs(List<List<Integer>> anslist,int[] candidates,int currentval,int start,int target,List<Integer> templist) {
		if(currentval>target) return;
		if(currentval==target) {
			anslist.add(new ArrayList<>(templist));
			return;
		}
		for(int i=start;i<candidates.length&&currentval+candidates[i]<=target;i++) {
			templist.add(candidates[i]);
			dfs(anslist,candidates,currentval+candidates[i],i+1,target,templist);
			templist.remove(templist.size()-1);
		}
	}
	public List<List<Integer>> removeduplicate(List<List<Integer>> list){
		
		return list;
	}
	
	public static void main(String[] args) {
		L40combinationSum2 ans =new L40combinationSum2();
		int[] candidates=new int[] {10,1,2,7,6,1,5};
		List<List<Integer>> anslist=ans.combinationSum(candidates, 8);
		System.out.println(anslist.size());
		for(int i=0;i<anslist.size();i++) {
			System.out.println(anslist.get(i).toString());
		}
	}
}

