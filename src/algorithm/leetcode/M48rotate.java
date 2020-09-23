package algorithm.leetcode;

import java.util.Arrays;

public class M48rotate {
	public void rotate(int[][] matrix) {
		int len=matrix.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<i;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i=0;i<len;i++) {
			for(int j=0;j<len/2;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][len-1-j];
				matrix[i][len-1-j]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[][] matrix= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		M48rotate res = new M48rotate();
		res.rotate(matrix);
		for(int i=0;i<matrix.length;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
