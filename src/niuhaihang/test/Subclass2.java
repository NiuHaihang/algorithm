package niuhaihang.test;

class Subclass2  extends Superclass{
	 private int n;
	  
	  Subclass2(){
	    super(300);  // 调用父类中带有参数的构造器
	    System.out.println("SubClass2");
	  }  
	  
	  public Subclass2(int n){ // 自动调用父类的无参数构造器
	    System.out.println("SubClass2(int n):"+n);
	    this.n = n;
	  }
}
