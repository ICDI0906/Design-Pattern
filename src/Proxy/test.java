package Proxy;

public class test {
	public static void main(String args[]) {
		AppleProxy appleProxy = new AppleProxy(new AppleProduct());
		appleProxy.buy("张开顺");
		appleProxy.buy("张先生");
	}
}
