package algorithm.leetcode;

public class H115numDistinct {
	public int numDistinct(String s, String t) {
		int slen = s.length();
        int tlen = t.length();
        if(slen<tlen) return 0;
        int[][] dp = new int[slen][tlen]; // dp[i][j]��ʾs��ǰi���ȵ��Ӵ��а���t��ǰj�������еĸ��������Ӵ�Ϊ���ӽ�
        //���s.charAt(i) != t.charAt(j),��dp[i][j] = dp[i-1][j]��������i����ĸ���Ӵ���j����ĸ����ȣ�����ǰi-1���ȵ������а���j�����Ӵ�������ǰi������������j�Ӵ����и������
        //���s.charAt(i) == t.charAt(j),��dp[i][j] = dp[i-1][j-1]+dp[i-1][j]��ǰi-1������������j-1�����Ӵ�������ǰi-1������������j�����Ӵ�����֮��
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
