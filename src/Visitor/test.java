package Visitor;

public class test {
	public static void main (String args[]) {
		Visitor visitor = new WordProcess();
		
		Visitable visitable = new CPU();
		visitable.accept(visitor);
		visitable = new Memory();
		visitable.accept(visitor);
	}
}
