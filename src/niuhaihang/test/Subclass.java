package niuhaihang.test;

class Subclass extends Superclass  {
	private int n;
	  
	  Subclass(){ // �Զ����ø�����޲���������
	    System.out.println("SubClass");
	  }  
	  
	  public Subclass(int n){ 
	    super(300);  // ���ø����д��в����Ĺ�����
	    System.out.println("SubClass(int n):"+n);
	    this.n = n;
	    System.out.println(this.n);
	  }
}
