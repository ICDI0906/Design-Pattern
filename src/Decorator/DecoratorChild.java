package Decorator;

public class DecoratorChild implements Behavior {
	private Behavior behavior;
	public DecoratorChild(Behavior behavior) {
		this.setBehavior(behavior);
	}
	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		behavior.behavior();
		System.out.println("小孩子也会跑");
	}
	public Behavior getBehavior() {
		return behavior;
	}
	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}

}
