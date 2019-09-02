package niuhaihang.test;

class Subclass extends Superclass  {
	private int n;
	  
	  Subclass(){ // 自动调用父类的无参数构造器
	    System.out.println("SubClass");
	  }  
	  
	  public Subclass(int n){ 
	    super(300);  // 调用父类中带有参数的构造器
	    System.out.println("SubClass(int n):"+n);
	    this.n = n;
	    System.out.println(this.n);
	  }
}
