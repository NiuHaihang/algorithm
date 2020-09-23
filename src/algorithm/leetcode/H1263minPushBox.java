package algorithm.leetcode;

public class H1263minPushBox {
	public int minPushBox(char[][] grid) {
		int step=0;
		
		return step;
	}
	public int[] boxStatus(char[][] grid,int x,int y) {
		int[] status=new int[]{0,0,0,};//status[0],[1],[2],[3]分别代表箱子的上右下左位置;
										//值为0代表可以朝这个方向移动，值为1代表不可以朝这个方向移动；值为2代表这个方向紧挨着目标位置
		int xlen=grid.length;
		int ylen=grid[0].length;
		if(x==0||grid[x-1][y]=='.') status[0]=0;
		if(y==ylen-1||grid[x][y+1]=='.') status[1]=0;
		if(x==xlen-1||grid[x+1][y]=='.') status[2]=0;
		if(y==0||grid[x][y-1]=='.') status[3]=0;
		
		return status;
	}
}
