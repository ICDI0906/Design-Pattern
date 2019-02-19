package Singleton;
/*
 * 使用静态代码块
 */
public class StaticBlock {
	private static StaticBlock instance = null;
	static {
		instance = new StaticBlock();
	}
	private StaticBlock() {}
	public static StaticBlock getInstance() {
		return instance;
	}
}
