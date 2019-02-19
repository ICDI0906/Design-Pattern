package Visitor;

public class PSProcess implements Visitor{


	@Override
	public void visit(CPU cpu) {
		// TODO Auto-generated method stub
		System.out.println("PS 进程访问" + cpu);
	}

	@Override
	public void visit(Memory memory) {
		// TODO Auto-generated method stub
		System.out.println("PS 进程访问" + memory);
	}

}
