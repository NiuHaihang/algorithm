package niuhaihang.test;
import java.util.*;
public class NetEasy2020091201 {
	static Map<Integer,List<Integer>> map = new HashMap<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] mn = sc.nextLine().split(" ");
		int m = Integer.valueOf(mn[0]);
		int n = Integer.valueOf(mn[1]);
		List<String> tree = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String in = sc.nextLine();
			tree.add(in);
		}
		map = new HashMap<>();
		buildTree(tree);
		int res = solve(map);
		System.out.println(res);
	}
	public static int solve(Map<Integer,List<Integer>> map) {
		int cnt = 0;
		for(List<Integer> l : map.values()) {
			if(l.size() == 2) {
				if(!map.containsKey(l.get(0)) && !map.containsKey(l.get(1))) cnt++;
			}
		}
		return cnt;
	}
	public static void buildTree(List<String> tree) {
		for(String s : tree) {
			String[] tmp = s.split(" ");
			int l = Integer.valueOf(tmp[0]);
			String m = tmp[1];
			int r = Integer.valueOf(tmp[2]);
			map.computeIfAbsent(l, unused -> new ArrayList<Integer>()).add(r);
		}
	}
	
}
