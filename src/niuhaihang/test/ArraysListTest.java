package niuhaihang.test;

import java.util.ArrayList;
import java.util.List;

public class ArraysListTest {
	public static void main(String[] args) {
		List<String[]> person = new ArrayList<>();
		String[] a = {"abc","def","ghi"};
		String[] b = {"jkl","mno","pqr"};
		String[] c = {"stu","vwx","yzz"};
		person.add(a);
		person.add(b);
		person.add(c);
		
		
		for(int i=0; i<person.size(); i++) {
			System.out.println(person.get(i)[i]);
		}
	}
	
}
