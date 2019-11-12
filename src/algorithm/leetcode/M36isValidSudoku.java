package algorithm.leetcode;

public class M36isValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		int[] row=new int[] {0,0,0,0,0,0,0,0,0,0};
		int[] column=new int[] {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<9;i++) {//判断每一列是否有重复元素
			for(int j=0;j<9;j++) {
				if(board[i][j]=='.') continue;
				column[board[i][j]-'0']++;
				if(column[board[i][j]-'0']>1) {
					System.out.println("第"+j+"列有重复元素");
					return false;
				}
			}
		}
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[j][i]=='.') continue;
				row[board[j][i]-'0']++;
				if(row[board[j][i]-'0']>1) {
					System.out.println("第"+j+"行有重复元素");
					return false;
				}
			}
		}
		for(int m=0;m<9;m=m+3) {
			for(int n=0;n<9;n=n+3) {
				System.out.println("m="+m+";n="+n);
				if(!isValidSubsquare(board,m,n)) return false;
			}
		}
		return true;
	}
	
	
	public boolean isValidSubsquare(char[][] subboard,int rowstart,int colstart) {
		int[] valid=new int[] {1,1,1,1,1,1,1,1,1,1};
		for(int i=rowstart;i<rowstart+3;i++) {
			for(int j=colstart;j<colstart+3;j++) {
				if(subboard[i][j]=='.') continue;
				valid[subboard[i][j]-'0']--;
			}
		}
		for(int i=1;i<10;i++) {
			if(valid[i]<=0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		char[][] board=new char[][] {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
		M36isValidSudoku ans =new M36isValidSudoku();
		if(ans.isValidSudoku(board)) {
			System.out.println("ahahah");
		}else {
			System.out.println("heheheheheh");
		}
	}
}
