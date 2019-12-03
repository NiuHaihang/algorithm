package algorithm.leetcode;

public class M1277countSquares {
	public int countSquares(int[][] matrix) {
		int cnt=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]==0) continue;
				
				int temp=countSquares(i,j,matrix);
				System.out.println("row="+i+",col="+j+",temp="+temp);
				cnt+=temp;
			}
		}
		return cnt;
	}
	public int countSquares(int rowStart,int colStart,int[][]matrix) {
		System.out.println("rowStart="+rowStart+",colStart="+colStart);
		int len=1;
		for(int i=rowStart+len;i<matrix.length;) {
			for(int j=colStart+len;j<matrix[rowStart].length;) {
				
			}
		}
	}
	public static void main(String[] args) {
		int[][] matrix= {{1,0,1},{1,1,0},{1,1,0}};
		M1277countSquares res=new M1277countSquares();
		int ans=res.countSquares(matrix);
//		int ans=res.countSquares(1, 0, matrix);
		System.out.println(ans);
	}
}
