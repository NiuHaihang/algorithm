package niuhaihang.test;

public class IndexOfSubstringTest {
	public static void main(String args[]) {
		String s = "res:count,avg(R3),max(R4)";
		String[] temp = s.split(",");
		for(String s1:temp) {
			System.out.println(s1);
		}
		int a = Integer.parseInt(temp[1].substring(temp[1].indexOf("R")+1,temp[1].indexOf(")")));
		int b = Integer.parseInt(temp[2].substring(temp[2].indexOf("R")+1,temp[2].indexOf(")")));
		int c = a + b;
		System.out.println(a+","+b+","+c);
	}
}
