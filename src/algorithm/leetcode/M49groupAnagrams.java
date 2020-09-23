package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class M49groupAnagrams {
	public List<List<String>> groupAnagrams (String[] strs){
		if(strs.length==0) return new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
		for(String s:strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if(!map.containsKey(key)) map.put(key, new ArrayList<>());
			map.get(key).add(s);
		}
		return new ArrayList(map.values());
	}
	public static void main(String[] args) {
		M49groupAnagrams ans = new M49groupAnagrams();
		//String[] strs = {"eat","tea","tan","ate","nat","bat"};
		String[] strs = {"bab","abb","",""};
		List<List<String>> ansList = ans.groupAnagrams(strs);
		System.out.println(ansList.toString());
	}
}


