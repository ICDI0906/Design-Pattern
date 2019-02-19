package Command;
/*
 * 游戏手柄
 */
public class Handle {
	private Command command;
	public Handle(Command com) {
		this.command = com;
	}
	public void press() {
		this.command.execute();
	}
}
