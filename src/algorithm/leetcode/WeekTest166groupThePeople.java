package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeekTest166groupThePeople {
	public List<List<Integer>> groupThrPeople(int[] groupSizes){
		List<List<Integer>> ansList=new ArrayList<>();
		int[][] tempList=new int[groupSizes.length][2];
		for(int i=0;i<groupSizes.length;i++) {
			tempList[i][0]=groupSizes[i];
			tempList[i][1]=i;
		}
		quickSort(tempList, 0, tempList.length-1);
		for(int j=0;j<tempList.length;j=j+tempList[j][0]) {
			List<Integer> temp=new ArrayList<>();
			for(int m=0;m<tempList[j][0];m++) {
				temp.add(tempList[j+m][1]);
			}
			ansList.add(temp);
		}
		return ansList;
	}
	public void quickSort(int[][] tempList,int low,int high) {
		if(tempList[0].length<2) return;
		if(low<high) {
			int pivot=Partition(tempList,low,high);
			quickSort(tempList, low, pivot-1);
			quickSort(tempList, pivot+1, high);
		}
	}
	
	public int Partition(int[][] tempList,int low,int high) {
		int pivot=low;
		int[] temp=new int[2];
		temp[0]=tempList[pivot][0];
		temp[1]=tempList[pivot][1];
		while(low<high) {
			System.out.println("high="+high);
			while(low<high&&temp[0]<=tempList[high][0]) {
				System.out.println("high2="+high);
				high--;
			}
			tempList[low][0]=tempList[high][0];
			tempList[low][1]=tempList[high][1];
			System.out.println("low="+low);
			while(low<high&&temp[0]>=tempList[low][0]) {
				System.out.println("low2="+low);
				low++;
			}
			tempList[high][0]=tempList[low][0];
			tempList[high][1]=tempList[low][1];
		}
		tempList[low][0]=temp[0];
		tempList[low][1]=temp[1];
		pivot=low;
		return pivot;
	}
	public static void main(String[] args) {
		WeekTest166groupThePeople res=new WeekTest166groupThePeople();
		int[] groupSizes= {2,1,3,3,3,2};
		List<List<Integer>> ansList=res.groupThrPeople(groupSizes);
		System.out.println(ansList.toString());
	}
}
