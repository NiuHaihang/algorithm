package algorithm.leetcode;

public class WeekTest164countServers {
	public int countServers(int[][] grid) {
		if(grid.length==0) return 0;
		int cnt=0;
		int ylen=grid.length;
		int xlen=grid[0].length;
		for(int i=0;i<ylen;i++) {
			int temp=0;
			System.out.println("cnt="+cnt+"temp="+temp);
			for(int j=0;j<xlen;j++) {
				if(grid[i][j]==0) continue;
				if(grid[i][j]==1){
					temp++;
					grid[i][j]=2;//grid=2代表被访问过
				}
				if(temp>1) {
					grid[i][j]=3;//grid=3代表北方问过且这个点已经统计过
				}
			}
			if(temp>1) {
				cnt=cnt+temp;
			}
		}
		for(int i=0;i<xlen;i++) {
			boolean flag=false;
			int temp=0;
			System.out.println("cnt="+cnt+"temp="+temp);
			for(int j=0;j<ylen;j++) {
				if(grid[i][j]==0) continue;
				else if(grid[i][j]==3||grid[i][j]==2) {
					flag=true;
				}
				if(grid[i][j]==2) {
					temp++;
					grid[i][j]=3;
				}
			}
			if(flag) {
				cnt=cnt+temp;
			}
			else if(temp>1) {
				cnt=cnt+temp;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int[][] grid= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		WeekTest164countServers countServer =new WeekTest164countServers();
		int ans=countServer.countServers(grid);
		System.out.println(ans);
	}
}
