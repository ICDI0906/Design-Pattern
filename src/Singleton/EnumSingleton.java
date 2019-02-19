package Singleton;
/*
 * 使用枚举
 */
public class EnumSingleton {
	private enum Singleton{
		SingletonFactory;
		private EnumSafeSingleton instance;
		private Singleton() {
			instance = new EnumSafeSingleton();
		}
		public EnumSafeSingleton getInstance() {
			return instance;
		}
	}
	public static EnumSafeSingleton getInstance() {
		return Singleton.SingletonFactory.getInstance();
	}
}
class EnumSafeSingleton {
	public EnumSafeSingleton() {
		
	}
}


