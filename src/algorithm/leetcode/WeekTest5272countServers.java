package algorithm.leetcode;

public class WeekTest5272countServers {
	public int countServers(int[][] grid) {
		if(grid.length==0) return 0;
		int cnt =0;
		int ylen=grid.length;//纵向长度
		int xlen=grid[0].length;//横向长度
		for(int i=0;i<ylen;i++) {//按每行统计
			int temp=0;
			int start = 0;
			for(int j=0;j<xlen;j++) {
				if(grid[i][j]==0) continue;
				else if(grid[i][j]==1) {
					temp++;
					grid[i][j]=2;
				}
				if(temp==1) start=j;
				if(temp>1) {
					grid[i][j]=3;
					grid[i][start]=3;
				}
			}
			if(temp>1){
				cnt+=temp;
			}
		}

		
		for(int i=0;i<xlen;i++) {//按每列统计
			int temp=0;
			int count3=0;
			for(int j=0;j<ylen;j++) {
				if(grid[j][i]==0) continue;
				if(grid[j][i]==2||grid[j][i]==3) {
					temp++;
				}
				if(grid[j][i]==3)
					count3++;
			}
			if(temp>1)
				cnt=cnt+temp-count3;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int[][] grid= {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
		WeekTest5272countServers countServers=new WeekTest5272countServers();
		int ans=countServers.countServers(grid);
		System.out.println(ans);
	}
}
