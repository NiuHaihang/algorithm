package decoratortest;

public class Main {
	public static void main(String[] args) {
	      Apple apple =new ConcreteApple();
	      System.out.println("-----------未装饰-------------------\n");
	      apple.description();//原来的方法
	      System.out.println("------------------------------------\n");
	      test2(apple) ;
	  }
	  private static void test2(Apple apple){
	      ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(apple);
	      System.out.println("\n-----------装饰后-------------------\n");
	        decoratorB.description();
	      System.out.println("------------------------------");
	  }
}
