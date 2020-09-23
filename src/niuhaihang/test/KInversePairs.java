package niuhaihang.test;

public class KInversePairs {
	//给出两个整数 n 和 k，找出所有包含从 1 到 n 的数字，且恰好拥有 k 个逆序对的不同的数组的个数
	public int kInversePairs(int n, int k) {
        //dp[i][j]表示从1到i的数字恰好拥有j个逆序对的不同数组的个数
        //完全逆序的数组（长度为n）中逆序对的个数为(n-1)+(n-2)+(n-3)+(n-4)+...+1=(n-1)n/2
        if(k > ((n-1)*n)>>1) return 0;
        int[][] dp = new int[n+1][k+1];
        //dp[i][j]=sum(dp[i-1][j-s])(s从0到i-1)
        //dp[i][j] = dp[i-1][j]+dp[i][j-1]-d[i-1][j-1]
        int MOD = 1000000007;
        for(int i = 1; i <= n; i++){
            dp[i][0] = 1;//完全递增序列
        }
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= k&&j<= (i*(i-1))>>1; j++){
        //         for(int s = 0; s <= i-1&&j-s>=0;s++){
        //             dp[i][j] = (dp[i][j]+dp[i-1][j-s])%MOD;
        //         }
        //     }
        // }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= k && j <= (i*(i-1))>>1; j++){
                int add = (dp[i-1][j]+MOD-((j-i)>=0?dp[i-1][j-i]:0))%MOD;
                dp[i][j] = (dp[i][j-1]+add)%MOD;
            }
        }
        return dp[n][k];
    }
}
