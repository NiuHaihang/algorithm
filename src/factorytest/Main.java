package factorytest;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		if(name.equals("man")) {
//			Man m = new Man();
//			m.say();
//		}else if(name.equals("woman")) {
//			Woman w = new Woman();
//			w.say();
//		}
		FactoryMan f = new FactoryMan();
		People m = f.create();
		m.say();
	}
}
