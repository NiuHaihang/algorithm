package decoratortest;


public abstract class Decorator implements Apple{
	protected Apple apple;
	public Decorator(Apple apple) {
		super();
		this.apple = apple;
	}
	@Override
	public void description() {
		apple.description();
	}
}