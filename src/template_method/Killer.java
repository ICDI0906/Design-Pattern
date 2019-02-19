package template_method;

public class Killer {
	private ToolBox tool;
	public Killer(ToolBox tool) {
		this.tool = tool;
	}
	public void change(ToolBox tool) {
		this.tool = tool;
	}
	public void kill() {
		this.tool.action();
	}
}
