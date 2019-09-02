package niuhaihang.test;

public class Superclass {
	private int n;
	  Superclass(){
	    System.out.println("SuperClass()");
	  }
	  Superclass(int n) {
	    System.out.println("SuperClass(int n)");
	    this.n = n;
	  }
}
