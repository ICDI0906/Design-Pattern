package Singleton;
/*
 * 不安全的单例
 */
public class UnsafeSingleton {
	private static UnsafeSingleton instance;
	private UnsafeSingleton() {};
	public static UnsafeSingleton getInstance() {
		if (instance == null) {
			instance = new UnsafeSingleton();
		}
		return instance;
	}
}
