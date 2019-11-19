package algorithm.leetcode;

public class H37solveSodoku {
	public void solveSodoku(char[][] board) {
		//判断某个位置是否已经有数字
		boolean[] curflag=new boolean[81];
		//判断数字是否已在某行摆放过
		boolean[][] rowflag=new boolean[9][9];
		//判断数字是否已在某列摆放过
		boolean[][] colflag=new boolean[9][9];
		//判断某数字是否已在某九宫格摆放过
		boolean[][] blockflag=new boolean[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]!='.') {
					int num=board[i][j]-'1';
					int blockIndex=i/3*3+j/3;
					int curIndex=i*9+j;
					rowflag[i][num]=colflag[j][num]=blockflag[blockIndex][num]=curflag[curIndex]=true;
				}
			}
		}
		
		solveSodoku(board,0,rowflag,colflag,blockflag,curflag);
	}
	
	public boolean solveSodoku(char[][] board,int cur,boolean[][] rowflag,boolean[][] colflag,boolean[][] blockflag,boolean[] curflag) {
		if(cur>=81) return true;//一共有0-80个位置，当前位置为cur，当cur=81时表明前面的位置上都放了数字
		if(curflag[cur]) {//当前位置已经有数字，直接往下一个位置放
			if(solveSodoku(board,cur+1,rowflag,colflag,blockflag,curflag))
				return true;
		}
		else 
			for(int i=0;i<9;i++) {//尝试从1-9中选一个合适的数字放进当前位置
			//System.out.println("cur="+cur);
			//"cur/9"代表当前行，从0开始计数，"cur%9"代表当前列，从0开始；cur/9/3*3+cur%9/3代表当前的块号
			if(!rowflag[cur/9][i] && !colflag[cur%9][i] && !blockflag[cur/9/3*3+(cur%9)/3][i]) {
				//System.out.println(cur);
				board[cur/9][cur%9]=(char)(i+'1');
				rowflag[cur/9][i]=colflag[cur%9][i]=blockflag[cur/9/3*3+(cur%9)/3][i]=curflag[cur]=true;
				if(solveSodoku(board,cur+1,rowflag,colflag,blockflag,curflag))
					return true;
				rowflag[cur/9][i]=colflag[cur%9][i]=blockflag[cur/9/3*3+(cur%9)/3][i]=curflag[cur]=false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		H37solveSodoku solve=new H37solveSodoku();
		char[][] board=new char[][] {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
		solve.solveSodoku(board);
		for(int i=0;i<81;i++) {
			if((i+1)%9==0)
				System.out.println(board[i/9][i%9]);
			else
				System.out.print(board[i/9][i%9]);
		}
	}
}
