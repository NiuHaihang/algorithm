package niuhaihang.test;

import java.util.*;

public class LC5520 {
	int res = 0;
	public int maxUniqueSplit(String s) {
		if(s.length() == 0) return 0;
		dfs(s,0,new StringBuilder(),new HashSet<String>());
		return res;
	}
	public void dfs(String s, int cur, StringBuilder sb,Set<String> set) {
		if(cur == s.length()) {
			res = Math.max(res,set.size());
		}
		if(set.size()+(s.length()-cur)<res) return;
		for(int i = cur; i < s.length(); i++) {
			sb.append(s.charAt(cur));
			if(!set.contains(sb.toString())) {
				set.add(sb.toString());
				dfs(s,i+1,new StringBuilder(),set);
				set.remove(sb.toString());
			}
			dfs(s,i+1,sb,set);
			sb.deleteCharAt(sb.length()-1);
		}
	}
}

