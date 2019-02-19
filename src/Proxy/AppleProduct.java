package Proxy;

public class AppleProduct implements Product {

	@Override
	public void buy(String username) {
		// TODO Auto-generated method stub
		System.out.println(username + "买苹果产品");
	}

}
