package template_method;

public class Ax extends ToolBox {

	@Override
	public String getTool() {
		// TODO Auto-generated method stub
		return "斧头";
	}

	@Override
	public void kill(String tool) {
		// TODO Auto-generated method stub
		System.out.println("使用" + tool + "杀人");
	}
}
