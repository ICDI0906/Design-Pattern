package Visitor;

public interface Visitor {
	public void visit(CPU cpu);
	public void visit(Memory memory);
}