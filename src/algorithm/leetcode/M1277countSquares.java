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
		boolean meetZero=false;
		while(!meetZero) {
			for(int i=rowStart,j=colStart;i<matrix.length&&i<=rowStart+len&&j<matrix[0].length&&j<=colStart+len;i++,j++) {
				System.out.println("len="+len+",i="+i+",j="+j+",rowStart+len="+(rowStart+len)+",colStart+len="+(colStart+len));
				System.out.println("matrix["+(rowStart+len)+"]["+j+"],matrix["+i+"]["+(colStart+len)+"]");
				if((rowStart+len)==matrix.length||(colStart+len)==matrix[0].length) {
					meetZero=true;
					break;
				}
				if(i==rowStart+len&&j==colStart+len&&matrix[rowStart+len][j]==1&&matrix[i][colStart+len]==1) {
					//meetZero=true;
					len++;
					break;
				}
				if(matrix[rowStart+len][j]==1&&matrix[i][colStart+len]==1) {
					System.out.println("hahahh");
					continue;
				}else if(matrix[rowStart+len][j]==0||matrix[i][colStart+len]==0) {
					meetZero=true;
					break;
				}
			}
		}
		System.out.println(len);
		return len;
	}
	public static void main(String[] args) {
		int[][] matrix= {{1,0,1},{1,1,0},{1,1,0}};
		M1277countSquares res=new M1277countSquares();
		int ans=res.countSquares(matrix);
//		int ans=res.countSquares(1, 0, matrix);
		System.out.println(ans);
	}
}
