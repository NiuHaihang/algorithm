package niuhaihang.test;

import java.util.Arrays;
import java.util.Comparator;

public class Java8Tester {
	public static void main(String[] args) {
		String[] players = {"Rafael Nadal", "Novak Djokovic",   
			    "Stanislas Wawrinka", "David Ferrer",  
			    "Roger Federer", "Andy Murray",  
			    "Tomas Berdych", "Juan Martin Del Potro",  
			    "Richard Gasquet", "John Isner"};  
			   
			// 1.1 使用匿名内部类根据 name 排序 players  
			Arrays.sort(players, new Comparator<String>() {  
			    @Override  
			    public int compare(String s1, String s2) {  
			        return (s1.compareTo(s2));  
			    }  
			});
			
			for(String s : players) {
				System.out.println(s);
			}
	}
}
