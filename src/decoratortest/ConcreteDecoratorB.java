package decoratortest;


public class ConcreteDecoratorB extends Decorator{
	public ConcreteDecoratorB(Apple apple) {
		super(apple);
		this.apple = apple;
	}
	public void resB() {
		System.out.println("B的扩展");
	}
	@Override
	public void description() {
		System.out.println("--------");
		super.description();
		System.out.println("BBBBBBBBBBB");
	}
}
