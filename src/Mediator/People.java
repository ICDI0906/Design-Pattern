package Mediator;

public interface People {
	public void act(Action action);
	public void addGroup(Group g);
	public void receive(Action action);
}
