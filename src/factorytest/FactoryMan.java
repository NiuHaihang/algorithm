package factorytest;

public class FactoryMan implements CreatePeople{
	public People create() {
		Man m = new Man();
		return m;
	}
}
