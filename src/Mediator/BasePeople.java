package Mediator;

public class BasePeople implements People {
	private Group g;
	@Override
	public void act(Action action) {
		// TODO Auto-generated method stub
		if(g != null) {
			g.act(this, action);
		}
	}

	@Override
	public void addGroup(Group g) {
		// TODO Auto-generated method stub
		this.g = g;
	}

	@Override
	public void receive(Action action) {
		// TODO Auto-generated method stub
		System.out.println(this + "收到回复" + action.getName());
	}
}
