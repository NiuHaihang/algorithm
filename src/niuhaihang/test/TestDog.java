package niuhaihang.test;

public class TestDog {
	public static void main(String args[]){
	      Animal a = new Animal(); // Animal ����
	      Animal b = new Dog(); // Dog ����
	 
	      a.move();// ִ�� Animal ��ķ���
	      b.move();//ִ�� Dog ��ķ���
	      ((Dog)b).bark();
	   }
}
