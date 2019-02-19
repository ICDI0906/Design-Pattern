package Decorator;

public class test {
	void getSum(int... a) {
		int sum = 0;
		for(int c: a) {
			sum += c;
		}
		System.out.println(sum);
	}
	public static void main(String args[]) {
		Behavior behavior = new Child();
		behavior.behavior();
		Behavior b2 = new DecoratorChild(behavior);
		b2.behavior();
		new test().getSum(1,2,3,4);
	}
}
