package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M47permuteUnique {
	public List<List<Integer>> permuteUnique(int[] nums){
		Arrays.sort(nums);
		int[] temp=new int[nums.length];
		List<List<Integer>> ansList = new ArrayList<>();
		int len=nums.length;
		permute(nums,ansList,temp,len,0);
		return ansList;
	}
	public void permute(int[] nums,List<List<Integer>> ansList,int[] temp,int len,int cur){
		if(cur==nums.length) {
			List<Integer> tempList=new ArrayList<>();
			for(int i=0;i<temp.length;i++) {
				tempList.add(temp[i]);
			}
			ansList.add(tempList);
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(i==0||nums[i]!=nums[i-1]) {
				int cnti=0;
				for(int m=0;m<nums.length;m++) {
					if(nums[m]==nums[i])
						cnti++;
				}
				int cntj=0;
				for(int n=0;n<cur;n++) {
					if(temp[n]==nums[i])
						cntj++;
				}
				if(cntj<cnti) {
					temp[cur]=nums[i];
					permute(nums,ansList,temp,len,cur+1);
				}
			}
			
		}
	}
	public static void main(String[] args) {
		M47permuteUnique res = new M47permuteUnique();
		int[] nums = {3,3,0,3};
		List<List<Integer>> ansList = res.permuteUnique(nums);
		System.out.println(ansList.toString());
	}
}
