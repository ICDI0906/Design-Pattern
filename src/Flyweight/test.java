package Flyweight;
public class test {
	public static void main(String args[]) {
		PenFactory factory = new PenFactory();
		Pen pen = factory.createPen(PenType.RED);
		System.out.println(pen.hashCode());
		pen.draw();
	}
}