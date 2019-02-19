package Visitor;

public class WordProcess implements Visitor {

	@Override
	public void visit(CPU cpu) {
		// TODO Auto-generated method stub
		System.out.println("Word 进程访问" + cpu);
	}

	@Override
	public void visit(Memory memory) {
		// TODO Auto-generated method stub
		System.out.println("Word 进程访问" + memory);
	}
	
}
