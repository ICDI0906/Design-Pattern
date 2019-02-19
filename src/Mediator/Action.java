package Mediator;

public enum Action {
	HELLO("你好啊"),AnyOne("有没有人?");
	private String name;
	Action(String name) {
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
