package Singleton;
/*
 * 安全的单例
 */
public class SafeSingleton {
	private static SafeSingleton instance;
	private SafeSingleton() {};
	public synchronized static SafeSingleton getInstance() {
		if (instance == null) {
			instance = new SafeSingleton();
		}
		return instance;
	}
}
