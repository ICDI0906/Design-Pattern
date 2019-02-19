package Prototype;
public class test {
	public static void main(String args[]) {
	
		ConcretePrototype1 prototype1 = new ConcretePrototype1();
		prototype1.clone().print();
		System.out.println(prototype1);
	}
}
