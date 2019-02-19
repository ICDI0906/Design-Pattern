package Mediator;

public class test {
	public static void  main(String args[]) {
		Group group = new WeiXinGroup();
		Alice alice = new Alice();
		Tom tom = new Tom();
		Bob bob = new Bob();
		
		group.addGroup(bob);
		group.addGroup(tom);
		group.addGroup(alice);
		alice.act(Action.AnyOne);
	}
}
