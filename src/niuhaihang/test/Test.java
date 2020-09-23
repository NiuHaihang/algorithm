package niuhaihang.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void test() {
		List<Integer> testList=new ArrayList<>(5);
		testList.add(1);
		System.out.println(testList.size());
		testList.add(2);
		System.out.println(testList.size());
	}
	
	public static void main(String[] args) throws InterruptedException{
		test();
    }
}
