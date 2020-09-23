package algorithm.leetcode;

public class H52solveQueen2 {
	int count=0;
	public int totalNQueens(int n) {
		int[][] checkboard = new int[n][n];
		totalNQueens(checkboard,0,n);
		return count;
	}
	
	public void totalNQueens(int[][] checkboard,int row,int n) {
		if(row==n) {
			count++;
			return;
		}
		for(int i=0;i<n;i++) {
			if(place(checkboard,row,i)) {
				checkboard[row][i]=1;
				totalNQueens(checkboard,row+1,n);
				checkboard[row][i]=0;
			}
		}
	}
	public boolean place(int[][] checkboard,int row,int col) {
		for(int i=0;i<row;i++) {
			if(checkboard[i][col]==1)
				return false;
		}
		int row1=row,col1=col;
		while(row1>=0&&col1>=0) {
			if(checkboard[row1--][col1--]==1)
				return false;
		}
		int row2=row,col2=col;
		while(row2>=0&&col2<checkboard.length) {
			if(checkboard[row2--][col2++]==1)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		H52solveQueen2 ans = new H52solveQueen2();
		int n = ans.totalNQueens(4);
		System.out.println(n);
	}
}
