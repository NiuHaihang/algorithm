package decoratortest;


public class ConcreteDecoratorA extends Decorator{
	public ConcreteDecoratorA(Apple apple) {
		super(apple);
	}
	public void resA() {
		System.out.println("A的扩展");
	}
	@Override
	public void description() {
		System.out.println("ahhhs");
		super.description();
		System.out.println("___________");
	}
}