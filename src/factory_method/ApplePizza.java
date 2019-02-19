package factory_method;

public class ApplePizza implements Pizza {
	final String name = "this is applePizza";
	@Override
	public String getPizza() {
		// TODO Auto-generated method stub
		return name;
	}

}
