package Proxy;

public class AppleProxy implements Product {
	private Product product;
	public AppleProxy(Product product){
		this.product = product;
	}
	@Override
	public void buy(String username) {
		// TODO Auto-generated method stub
		if(username.equals("张开顺")){
			System.out.println(username + "无权购买苹果产品");
		}else {
			product.buy(username);
		}
	}
}
