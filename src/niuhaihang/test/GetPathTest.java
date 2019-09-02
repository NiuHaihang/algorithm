package niuhaihang.test;

public class GetPathTest {
	public void run() {
		System.out.println("=====test======");
		String s1 = this.getClass().getResource("").getPath();
		String s2 = this.getClass().getResource("/").getPath();
		System.out.println(s1);
		System.out.println(s2);
		
	}
	public static void main(String[] args) {
		new GetPathTest().run();
	}
}
