package niuhaihang.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> l=new ArrayList<>();
		List<Integer> m=new ArrayList<>(l);
		l.add(1);
		l.add(2);
		m.add(3);
		m.add(4);
		ans.add(l);
		ans.add(m);
		l.remove(l.size()-1);
		m.remove(m.size()-1);
		System.out.println(ans.size());
		System.out.println(l.toString());
		System.out.println(m.toString());
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i).toString());
		}
    }
}
