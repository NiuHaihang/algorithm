package algorithm.leetcode;

public class E1275tictacoe {
	public String tictactoe(int[][] moves) {
		if(moves.length==0) return "Pending";
		char[][] board=new char[3][3];
		for(int i=0;i<moves.length;i++) {
			if(i%2==0) {
				board[moves[i][0]][moves[i][1]]='X';
			}
		}
		for(int i=0;i<moves.length;i++) {
			if(i%2==1) {
				board[moves[i][0]][moves[i][1]]='O';
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
		if(AWins(board)) return "A";
		else if(BWins(board)) return "B";
		else if(moves.length<9&&!AWins(board)&&!BWins(board)) return "Pending";
		else return "Draw";
	}
	public boolean AWins(char[][] board) {
		if(board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X') return true;
		if(board[1][0]=='X'&&board[1][1]=='X'&&board[1][2]=='X') return true;
		if(board[2][0]=='X'&&board[2][1]=='X'&&board[2][2]=='X') return true;
		if(board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X') return true;
		if(board[0][1]=='X'&&board[1][1]=='X'&&board[2][1]=='X') return true;
		if(board[0][2]=='X'&&board[1][2]=='X'&&board[2][2]=='X') return true;
		if(board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X') return true;
		if(board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X') return true;
		return false;
	}
	public boolean BWins(char[][] board) {
		if(board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O') return true;
		if(board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O') return true;
		if(board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O') return true;
		if(board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O') return true;
		if(board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O') return true;
		if(board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O') return true;
		if(board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O') return true;
		if(board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O') return true;
		return false;
	}
	
	public static void main(String[] args) {
		int[][] moves= {{0,0},{2,0},{1,1},{2,1},{2,2}};
		System.out.println(moves.length);
		E1275tictacoe ans=new E1275tictacoe();
		String res=ans.tictactoe(moves);
		System.out.println(res);
	}
}
