package niuhaihang.test;

public class LC5521 {
	int mod = 1000000007;
	public int maxProductPath(int[][] grid) {
		if(grid[0][0] == 0) return 0;
		int row = grid.length;
		int col = grid[0].length;
		long[][][] dp = new long[row][col][2];
		boolean zero = false;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(i==0&&j==0) {
					if(grid[0][0]>0) {
						dp[i][j][0] = grid[i][j];
					}else {
						dp[i][j][1] = grid[i][j];
					}
					continue;
				}
				if(grid[i][j]>0) {
					if(i==0||j==0) {
						if(i==0) {
							dp[i][j][0] = (dp[i][j-1][0]*grid[i][j])%mod;
							dp[i][j][1] = (dp[i][j-1][1]*grid[i][j])%mod;
						}else {
							dp[i][j][0] = (dp[i-1][j][0]*grid[i][j])%mod;
							dp[i][j][1] = (dp[i-1][j][1]*grid[i][j])%mod;
						}
					}else {
						dp[i][j][0] = Math.max(dp[i-1][j][0]*grid[i][j],dp[i][j-1][0]*grid[i][j])%mod;
						dp[i][j][1] = Math.min(dp[i-1][j][1]*grid[i][j],dp[i][j-1][1]*grid[i][j])%mod;
					}
				}else if(grid[i][j] < 0){
					if(i==0||j==0) {
						if(i==0) {
							dp[i][j][0] = (dp[i][j-1][1]*grid[i][j])%mod;
							dp[i][j][1] = (dp[i][j-1][0]*grid[i][j])%mod;
						}else {
							dp[i][j][0] = (dp[i-1][j][1]*grid[i][j])%mod;
							dp[i][j][1] = (dp[i-1][j][0]*grid[i][j])%mod;
						}
					}else {
						dp[i][j][0] = Math.max(dp[i-1][j][1]*grid[i][j],dp[i][j-1][1]*grid[i][j])%mod;
						dp[i][j][1] = Math.min(dp[i-1][j][0]*grid[i][j],dp[i][j-1][0]*grid[i][j])%mod;
					}
				}else {
					dp[i][j][0] = 0;
					dp[i][j][1] = 0;
					zero = true;
				}
			}
		}
		if(dp[row-1][col-1][0] == 0) return zero?0:-1;
		return dp[row-1][col-1][0]>=0?(int)dp[row-1][col-1][0]:-1;
	}
}
