package algorithm.leetcode;

public class H1269numWays {
	public int numWays(int steps,int arrLen) {
		int mod =1000000007;
		arrLen=Math.min(steps+1,arrLen);
		int[][] step=new int[steps+1][arrLen];//step[i][j]表示第i步走到array[j]的位置时走的步数
		step[0][0]=1;
		for(int i=1;i<=steps;i++){
			for(int j=0;j<arrLen;j++) {
				for(int k=-1;k<=1;k++) {
					if(j+k>=0&&j+k<arrLen) {
						step[i][j]=(step[i][j]+step[i-1][j+k])%mod;
					}
				}
				
			}
		}
		return step[steps][0];
	}
	public static void main(String[] args) {
		H1269numWays numWays=new H1269numWays();
		int cnt=numWays.numWays(3, 2);
		System.out.println(cnt);
	}
}
