package niuhaihang.test;

class Subclass2  extends Superclass{
	 private int n;
	  
	  Subclass2(){
	    super(300);  // ���ø����д��в����Ĺ�����
	    System.out.println("SubClass2");
	  }  
	  
	  public Subclass2(int n){ // �Զ����ø�����޲���������
	    System.out.println("SubClass2(int n):"+n);
	    this.n = n;
	  }
}
