package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class H51solveNQueen {
	List<List<String>> ansList = new ArrayList<>();
	public List<List<String>> sloveQueens(int n){
		
		int[][] board = new int[n][n];
		nQueens(board,0,n);
		return ansList;
		
	}
	
	public void nQueens(int[][] board,int start,int end) {
		if(start==end) {
			List<String> tempList = new ArrayList();
			for(int i=0;i<end;i++) {
				StringBuilder sb = new StringBuilder();
				for(int j=0;j<end;j++) {
					if(board[i][j]==0) {
						sb.append('.');
					}else {
						sb.append('Q');
					}
				}
				tempList.add(sb.toString());
			}
			ansList.add(tempList);
			return;
		}
		for(int i=0;i<end;i++) {
			if(place(board,start,i)) {
				board[start][i]=1;
				nQueens(board,start+1,end);
				board[start][i]=0;
			}
		}
	}
	public boolean place(int[][] board,int row,int col) {
		for(int i=0;i<row;i++) {
			if(board[i][col]==1) return false;
		}
		
		int row1=row,col1=col;
		while(row1>=0&&col1>=0) {
			if(board[row1--][col1--]==1) return false;
		}
		
		int row2=row,col2=col;
		while(row2>=0&&col2<board.length) {
			if(board[row2--][col2++]==1) return false;
		}
		return true;

	}
	
	public static void main(String[] args) {
		H51solveNQueen ans = new H51solveNQueen();
		List<List<String>> ansList = ans.sloveQueens(4);
		System.out.println(ansList.toString());
	}
}
