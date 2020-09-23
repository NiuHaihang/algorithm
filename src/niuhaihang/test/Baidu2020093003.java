package niuhaihang.test;
import java.util.*;
public class Baidu2020093003 {
	public static int mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][][] memo = new long[n+1][m+1][m+1];
		long cnt = 0;
		for(int i = 1; i <= m; i++) {
			System.out.println("i="+i);
			cnt += dfs(n,m,i,i,0,memo);
			cnt %= mod;
		}
		System.out.println(cnt);
	}
	public static long dfs(int n,int m,int cur,int pre,int last,long[][][] memo) {
		System.out.println("n="+n+",m="+m+",cur="+cur+",pre="+pre+"last="+last);
		if(memo[cur][pre][last] != 0) return memo[cur][pre][last];
		if(cur == n) {
			memo[cur][pre][last] = 1;
			return memo[cur][pre][last];
		}
		for(int i = 1; i <= m&&i!=pre&&i!=last; i++) {
			if(cur+i<=n) {
				memo[cur][pre][last] += dfs(n,m,cur+i,i,pre,memo);
				memo[cur][pre][last] %= mod;
			}
		}
		return memo[cur][pre][last];
	}
}
