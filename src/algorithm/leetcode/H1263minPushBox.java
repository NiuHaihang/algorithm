package algorithm.leetcode;

public class H1263minPushBox {
	public int minPushBox(char[][] grid) {
		int step=0;
		
		return step;
	}
	public int[] boxStatus(char[][] grid,int x,int y) {
		int[] status=new int[]{0,0,0,};//status[0],[1],[2],[3]�ֱ�������ӵ���������λ��;
										//ֵΪ0������Գ���������ƶ���ֵΪ1�������Գ���������ƶ���ֵΪ2����������������Ŀ��λ��
		int xlen=grid.length;
		int ylen=grid[0].length;
		if(x==0||grid[x-1][y]=='.') status[0]=0;
		if(y==ylen-1||grid[x][y+1]=='.') status[1]=0;
		if(x==xlen-1||grid[x+1][y]=='.') status[2]=0;
		if(y==0||grid[x][y-1]=='.') status[3]=0;
		
		return status;
	}
}
