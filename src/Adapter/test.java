package Adapter;

public class test {
	public static void main(String args[]) {
		Line line = new Line(new SignalAdapter());
		line.transfer();
	}
}
