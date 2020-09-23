package niuhaihang.test;

public class PDD20200808 {
	int cnt;
	public void dfs(int[] c,int cur, StringBuilder sb) {
		if(sb.length() == cur) {
			cnt++;
			return;
		}
		for(int i = 0; i < 26; i++) {
			if(c[i]<=0) continue;
			c[i]--;
			sb.append('A'+c[i]);
			dfs(c,cur,sb);
			sb.deleteCharAt(sb.length()-1);
			c[i]++;
		}
	}
	public static void main(String[] args) {
		String s = "AAB";
		int[] cs = new int[26];
		for(int i = 0; i < s.length(); i++) {
			cs[s.charAt(i)-'A']++;
		}
		PDD20200808 pd = new PDD20200808();
		for(int i = 1; i <= s.length(); i++) {
			pd.dfs(cs,i,new StringBuilder());
		}
		System.out.println(pd.cnt);
	}
}
