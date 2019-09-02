package algorithm.leetcode17.LetterCombination;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
	public static List<String> letterCombinations(String digits){
		List<String> l = new ArrayList<String>(); 
		Map<Character, List<String>> map = new HashMap<>();
		map.put('2', Arrays.asList("a","b","c"));
		map.put('3', Arrays.asList("d","e","f"));
		map.put('4', Arrays.asList("g","h","i"));
		map.put('5', Arrays.asList("j","k","l"));
		map.put('6', Arrays.asList("m","n","o"));
		map.put('7', Arrays.asList("p","q","r","s"));
		map.put('8', Arrays.asList("t","u","v"));
		map.put('9', Arrays.asList("w","x","y","z"));
		
		char[] nums = digits.toCharArray();
		if(nums.length == 0) return l;
		if(nums.length == 1) return map.get(nums[0]);
		
		l.addAll(map.get(nums[0]));
		
		for(int i = 1; i < digits.length(); i++) {
			List<String> temp = new ArrayList<>();
			temp = unionList(l,map.get(nums[i]));
			l.clear();
			l = temp;
		}
		return l;
	}
	
	private static List<String> unionList(List<String> l1, List<String> l2){
		List<String> list = new ArrayList<>();
		for(String a:l1) {
			for(String b:l2) {
				list.add(a+b);
			}
		}
		return list;
	}
	
	public static void main(String args[]) {
		String digits = "234";
		List<String> l= letterCombinations(digits);
		System.out.println(l);
	}
}
