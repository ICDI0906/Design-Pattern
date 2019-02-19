package factory_method;

public class PizzaStore implements Store{

	@Override
	public Pizza orderPizza(String name) {
		// TODO Auto-generated method stub
		if(name.equals("apple")) {
			return new ApplePizza();
		}
		else {
			return new MusclePizza();
		}
	}
	
}
