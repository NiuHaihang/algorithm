package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M1282groupThePeople {
	public List<List<Integer>> groupThePeople(int[] groupSizes){
		List<List<Integer>> ansList = new ArrayList<>();
		int rowLen=Math.max(2, groupSizes.length);
		int[][] temp=new int[groupSizes.length+1][groupSizes.length+1];
		for(int i=0;i<groupSizes.length;i++) {
			temp[groupSizes[i]][0]++;
			temp[groupSizes[i]][temp[groupSizes[i]][0]]=i;
		}
			
		for(int i=0; i<temp.length; i++) {
			if(temp[i][0]==0) continue;
			else {
				int cursor=1;
				int cnt=0;
				List<Integer> tempList = new ArrayList<>();
				for(;cursor<=temp[i][0];cursor++) {
					tempList.add(temp[i][cursor]);
					cnt++;
					if(cnt==i) {
						ansList.add(tempList);
						tempList =new ArrayList<>();
						cnt=0;
					}
				}
			}
		}
		return ansList;
	}
	
	public static void main(String[] args) {
		M1282groupThePeople res =new M1282groupThePeople();
		int[] groupSize = {1};
		List<List<Integer>> ansList=res.groupThePeople(groupSize);
		System.out.println(ansList.toString());
	}
}
