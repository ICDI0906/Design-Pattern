package Singleton;
/*
 * 饿汉模式，基于类加载机制保证线程安全
 */
public class HungerSingleton {
	public static HungerSingleton instance = new HungerSingleton();
	private HungerSingleton() {}
	public static HungerSingleton getInstance() {
		return instance;
	}
}
