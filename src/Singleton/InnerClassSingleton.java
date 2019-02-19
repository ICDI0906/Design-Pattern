package Singleton;

public class InnerClassSingleton {
	private static class InnerClassSingletonHandler{
		private static InnerClassSingleton instance = new InnerClassSingleton();
	}
	private InnerClassSingleton() {
		
	}
	public static InnerClassSingleton getInstance() {
		return InnerClassSingletonHandler.instance;
	}
}
