package niuhaihang.test;

import java.util.*;

public class YFD20202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer> map = new HashMap<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> res = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			int cur = sc.nextInt();
			if(!map.containsKey(cur)) {
				map.put(cur, 1);
				res.add(cur);
			}else if(map.containsKey(cur)){
				if(map.get(cur)>=m) {
					set.add(cur);
					continue;
				}else {
					map.put(cur, map.get(cur)+1);
					res.add(cur);
				}
			}
		}
		for(int i = 0; i < res.size(); i++) {
			if(set.contains(res.get(i))) continue;
 			if(i == res.size()-1) {
				System.out.println(res.get(i));
			}else {
				System.out.print(res.get(i)+" ");
			}
		}
	}
}
