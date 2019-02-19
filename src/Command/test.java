package Command;

public class test {
	public static void main(String args[]) {
		Person p = new Person();
		DownCommand dc = new DownCommand(p);
		UpCommand uc = new UpCommand(p);
		Handle handle = new Handle(dc);
		handle.press();
		handle = new Handle(uc);
		handle.press();
	}
}
