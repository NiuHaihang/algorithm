package niuhaihang.test;
import java.util.*;
public class NetEasy2020091204 {
	static int res = 0;
	static Set<Integer> boyset;
	static Set<Integer> girlset;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boyset = new  HashSet<>();
		girlset = new HashSet<>();
		String[] boy = sc.nextLine().split(" ");
		int[] boys = new int[boy.length];
		for(int i = 0; i < boys.length; i++) {
			boys[i] = Integer.valueOf(boy[i]);
			boyset.add(boys[i]);
		}
		String[] girl = sc.nextLine().split(" ");
		int[] girls = new int[girl.clone().length];
		for(int i = 0; i < girls.length; i++) {
			girls[i] = Integer.valueOf(girl[i]);
			girlset.add(girls[i]);
		}
		int n = Integer.valueOf(sc.nextLine());
		int[][] pair = new int[n][2];
		for(int i = 0; i < n; i++) {
			String[] line = sc.nextLine().split(" ");
			pair[i][0] = Integer.valueOf(line[0]);
			pair[i][1] = Integer.valueOf(line[1]);
		}
		res = 0;
		int cnt = boys.length;
		dfs(pair,0,boyset,girlset,cnt);
		System.out.println(res);
	}
	public static void dfs(int[][] pair,int cur,Set<Integer> boyset,Set<Integer> girlset,int cnt) {
		if(cur == pair.length) {
			res = Math.max(res, cnt-boyset.size());
		}
		for(int i = cur; i < pair.length; i++) {
			int b = pair[i][0];
			int g = pair[i][1];
			if(!boyset.contains(b) || girlset.contains(g)) continue;
			boyset.remove(b);
			girlset.remove(g);
			dfs(pair,i+1,boyset,girlset,cnt);
			boyset.add(b);
			girlset.add(g);
		}
	}
}
