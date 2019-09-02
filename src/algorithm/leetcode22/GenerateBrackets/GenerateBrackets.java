package algorithm.leetcode22.GenerateBrackets;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateBrackets {
	public static List<String> generateBrackets(int n){
		List<String> list = new ArrayList<String>();
		generateDFS(n, 1, 0, "(", list);
		return list;
	}
	public static void generateDFS(int n,int left,int right,String ans,List<String> temp) {
		if(right > n || left > n) return;
		if(right > left) return;
		if(left == n && right == n) {
			temp.add(ans);
		}
		if(left >= right) {
			String ans1 = new String(ans);
			generateDFS(n, left+1, right, ans+"(", temp);
			generateDFS(n, left, right+1, ans1+")", temp);
		}
	}
	public static void main(String[] args) {
		List<String> list = generateBrackets(3);
		for(String s:list) {
			System.out.println(s);
		}
	}
}
