package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WeeklyTest180luckyNumbers {
	public List<Integer> luckyNumbers(int[][] matrix){
		List<Integer> ansList = new ArrayList();
		int rowlen = matrix[0].length;
		int collen = matrix.length;
		System.out.println(rowlen+" "+collen);
		for(int i=0;i<collen;i++) {
			System.out.println("i="+i);
			for(int j=0;j<rowlen;j++) {
				if(isLucky(matrix,i,j)) {
					ansList.add(matrix[i][j]);
				}
			}
		}
		return ansList;
	}
	public boolean isLucky(int[][] matrix,int row,int col) {
		System.out.println("row="+row+",col="+col);
		int rowlen = matrix[0].length;
		int collen = matrix.length;
		for(int i=0;i<collen;i++) {
			if(matrix[row][col]<matrix[i][col])
				return false;
		}
		for(int j=0;j<rowlen;j++) {
			if(matrix[row][col]>matrix[row][j])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		WeeklyTest180luckyNumbers ans = new WeeklyTest180luckyNumbers();
		int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
		List<Integer> ansList = ans.luckyNumbers(matrix);
		System.out.println(ansList.toString());
	}
}
