package template_method;

public class test {
	public static void main(String args[]) {
		Killer killer = new Killer(new Hammer());
		killer.kill();
		killer.change(new Ax());
		killer.kill();
	}
}
