package Interpreter;

public class TerminalExpression implements AbstractExpression {
	private String name;
	public TerminalExpression(String name) {
		this.name = name;
	}
	@Override
	public Object interpreter(Context context) {
		// TODO Auto-generated method stub
		return context.getMp().get(this.name);
	}

}
