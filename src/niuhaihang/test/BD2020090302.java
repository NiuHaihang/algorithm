package niuhaihang.test;
import java.util.*;
public class BD2020090302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int T = sc.nextInt();
			for(int i = 0; i < T; i++) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				Map<Integer,pair> set = new HashMap<>();
				for(int c = 1; c <= n; c++) {
					set.put(c,new pair(c,1));
				}
				for(int j = 0; i < m; j++) {
					int k = sc.nextInt();
					for(int l = 0; l < k; l++) {
						int left = sc.nextInt();
						int right = sc.nextInt();
						cut(set,left,right);
					}
				}
				System.out.println(set.size());
				int tmp = 0;
				for(pair e : set.values()) {
					if(e.cnt>tmp) tmp = e.cnt; 
				}
				List<Integer> list = new ArrayList<>();
				for(pair e :set.values()) {
					if(e.cnt == tmp) {
						list.add(e.e);
					}
				}
				for(int index = 0; index < list.size(); index++) {
					if(index == list.size()-1) {
						System.out.println(list.get(index));
					}else {
						System.out.print(list.get(index)+" ");
					}
				}
			}
		}
	}
	public static void cut(Map<Integer,pair> map,int left,int right) {
		for(int i = left; i <= right; i++) {
			map.get(i).cnt++;
		}
	}
	static class pair{
		int e;
		int cnt;
		public pair(int e,int cnt) {
			this.e = e;
			this.cnt= cnt;
		}
		public int HashCode() {
			return e;
		}
		public boolean equals(pair a) {
			return a.e == e && a.cnt == cnt;
		}
	}
}
