package template_method;

public abstract class ToolBox {
	public abstract String getTool();
	public abstract void kill(String tool);
	public void action() {
		String tool  = getTool();
		kill(tool);
	}
}
