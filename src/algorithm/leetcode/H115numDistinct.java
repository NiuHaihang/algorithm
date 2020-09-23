package algorithm.leetcode;

public class H115numDistinct {
	public int numDistinct(String s, String t) {
		int slen = s.length();
        int tlen = t.length();
        if(slen<tlen) return 0;
        int[][] dp = new int[slen][tlen]; // dp[i][j]表示s的前i长度的子串中包含t的前j长度序列的个数，以子串为主视角
        //如果s.charAt(i) != t.charAt(j),则dp[i][j] = dp[i-1][j]，主串第i个字母和子串第j个字母不相等，所以前i-1长度的主串中包含j长度子串个数和前i长度主串包含j子串序列个数相等
        //如果s.charAt(i) == t.charAt(j),则dp[i][j] = dp[i-1][j-1]+dp[i-1][j]，前i-1长度主串包含j-1长度子串个数和前i-1长度主串包含j长度子串个数之和
        if(s.charAt(0) == t.charAt(0)) dp[0][0] = 1;
        else dp[0][0] = 0;
        
        for(int j = 1; j < slen; j++){
                if(s.charAt(j) == t.charAt(0)){
                    dp[j][0] = dp[j-1][0] + 1;
                }else{
                    dp[j][0] = dp[j-1][0];
                }
        }

        for(int i = 1; i < tlen; i++){
            for(int j = i; j < slen; j++){
                if(s.charAt(j) == t.charAt(i)){
                    dp[j][i] = dp[j-1][i-1] + dp[j-1][i];
                }else{
                    dp[j][i] = dp[j-1][i];
                }
            }
        }
        return dp[slen-1][tlen-1];
    }
	
	public static void main(String[] args) {
		H115numDistinct res = new H115numDistinct();
		int ans = res.numDistinct("rabbbit", "rabbit");
		System.out.println(ans);
	}
}
