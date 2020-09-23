package decoratortest;

public class ConcreteApple implements Apple{
	@Override
	public void description() {
		System.out.println("this is an apple!");
	}
}