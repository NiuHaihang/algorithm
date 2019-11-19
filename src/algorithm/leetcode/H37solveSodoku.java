package algorithm.leetcode;

public class H37solveSodoku {
	public void solveSodoku(char[][] board) {
		//�ж�ĳ��λ���Ƿ��Ѿ�������
		boolean[] curflag=new boolean[81];
		//�ж������Ƿ�����ĳ�аڷŹ�
		boolean[][] rowflag=new boolean[9][9];
		//�ж������Ƿ�����ĳ�аڷŹ�
		boolean[][] colflag=new boolean[9][9];
		//�ж�ĳ�����Ƿ�����ĳ�Ź���ڷŹ�
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
		if(cur>=81) return true;//һ����0-80��λ�ã���ǰλ��Ϊcur����cur=81ʱ����ǰ���λ���϶���������
		if(curflag[cur]) {//��ǰλ���Ѿ������֣�ֱ������һ��λ�÷�
			if(solveSodoku(board,cur+1,rowflag,colflag,blockflag,curflag))
				return true;
		}
		else 
			for(int i=0;i<9;i++) {//���Դ�1-9��ѡһ�����ʵ����ַŽ���ǰλ��
			//System.out.println("cur="+cur);
			//"cur/9"����ǰ�У���0��ʼ������"cur%9"����ǰ�У���0��ʼ��cur/9/3*3+cur%9/3����ǰ�Ŀ��
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
