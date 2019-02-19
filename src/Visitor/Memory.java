package Visitor;

public class Memory implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	public String toString() {
		return "Memory";
	}
}
