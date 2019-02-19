package Observer;

public class Weather extends Observable<Weather,CommonObserver,WeatherType>{
	private WeatherType currentWeather;
	public Weather() {
		this.currentWeather = WeatherType.Sunny;
	}
	public void change() {
		if(this.currentWeather == WeatherType.Rain) {
			this.currentWeather = WeatherType.Sunny;
		}
		else {
			this.currentWeather = WeatherType.Rain;
		}
		notify(this.currentWeather);
	}
}
