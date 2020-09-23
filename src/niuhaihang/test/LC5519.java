package niuhaihang.test;

import java.util.ArrayList;
import java.util.List;

public class LC5519 {
	public static String reorderSpaces(String text) {
		List<String> tmp = new ArrayList<>();
		boolean open = true;
		int cnt = 0;
		for(char ch:text.toCharArray()) {
			if(ch == ' ') {
				cnt++;
			}
		}
		text = text.trim();
		System.out.println("now text is:"+text);
		StringBuilder sb = new StringBuilder();
		for(char ch:text.toCharArray()) {
			if(ch == ' ') {
				if(!open) continue;
				tmp.add(sb.toString());
				sb = new StringBuilder();
				open = false;
			}else {
				open = true;
				sb.append(ch);
			}
		}
		tmp.add(sb.toString());
		System.out.println(tmp);
		int n = tmp.size();
		if(n == 1) {
			StringBuilder res= new StringBuilder(tmp.get(0));
			for(int i = 0; i < cnt; i++) {
				res.append(' ');
			}
			return res.toString();
		}
		int mid = cnt/(n-1);
		int last = cnt%(n-1);
		System.out.println("n="+n+",mid="+mid+",last="+last);
		StringBuilder res = new StringBuilder();
		int cur = 1;
		for(String s:tmp) {
			System.out.println("cur="+cur);
			if(cur == n) {
				res.append(s);
			}else {
				res.append(s);
				for(int i = 0; i < mid; i++) {
					res.append(' ');
				}
			}
			cur++;
		}
		for(int i = 0; i < last; i++) {
			res.append(' ');
		}
		return res.toString();
	}
	public static void main(String[] args) {
		String[] list = {"  this   is  a sentence "," practice   makes   perfect","hello   world","  walks  udp package   into  bar a","a"};
		for(String s : list) {
			String res = reorderSpaces(s);
			System.out.println(res);
		}
	}
}
