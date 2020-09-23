package niuhaihang.test;

public class SingleTon {
	private SingleTon() {
		
	}
	public static SingleTon getInstance() {
		return Inner.instance;
	}
	private static class Inner{
		private static final SingleTon instance = new SingleTon();
	}
}
