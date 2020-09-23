package algorithm.leetcode;

public class WeekTest165countSquares {
	public int countSquares(int[][] matrix) {
		int ansNum=0;
		int row=matrix.length;
		int col=matrix[0].length;
		int num=Math.min(row, col);
		int[][] ansMatrix=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(matrix[i][j]==0) continue;
				else {
					ansNum+=countSquares(matrix,i,j,row,col,0);
				}
			}
		}
		return ansNum;
	}
	
	public int countSquares(int[][] matrix,int rowstart,int colstart,int row,int col,int count) {
		if(rowstart==row&&colstart==col) {
			return (matrix[rowstart][colstart]==1?count+1:count);
		}
		return count;
	}
}
