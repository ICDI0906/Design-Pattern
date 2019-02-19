package Observer;

public class Channel implements CommonObserver {

	@Override
	public void update(WeatherType argument) {
		// TODO Auto-generated method stub
		switch(argument) {
		case Sunny:
			System.out.println("the weather is sunny");
			break;
		case Rain:
			System.out.println("the weather is rain");
			break;
		}
	}

}
