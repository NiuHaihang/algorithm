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
		//removeduplicate(anslist);
		return anslist;
	}
	public void dfs(List<List<Integer>> anslist,int[] candidates,int currentval,int start,int target,List<Integer> templist) {
		if(currentval>target) return;
		if(currentval==target) {
			anslist.add(new ArrayList<>(templist));
			return;
		}
		for(int i=start;i<candidates.length&&currentval+candidates[i]<=target;i++) {
			if(i!=start&&candidates[i]==candidates[i-1]) continue;
			templist.add(candidates[i]);
			dfs(anslist,candidates,currentval+candidates[i],i+1,target,templist);
			templist.remove(templist.size()-1);
		}
	}
	public void removeduplicate(List<List<Integer>> list){
		for(int i=0;i<list.size();i++) {
			//System.out.println("i="+i);
			List<Integer> firstList=list.get(i);
			int l1=firstList.size();
			for(int j=i+1;j<list.size();j++) {
				//System.out.println("j="+j);
				List<Integer> secondList=list.get(j);
				int l2=secondList.size();
				int index=0;
				if(l1!=l2) continue;
				while(index<l2&&firstList.get(index)==secondList.get(index)) {
					index++;
				}
				if(index==l2) {
					list.remove(j--);
				}
			}
			
		}
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

