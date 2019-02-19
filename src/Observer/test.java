package Observer;

public class test {
	public static void main(String args[]) {
		Weather weather = new Weather();
		CommonObserver observer = new Channel();
		weather.addObserver(observer);
		weather.change();
		weather.change();
	}
}
