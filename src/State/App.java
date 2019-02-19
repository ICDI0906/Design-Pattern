package State;

public class App {
	private State state;
	public App() {
		state = new SuccessState();
	}
	public void run() {
		if(state.getClass().equals(SuccessState.class)) {
			state = new ErrorState();
			state.handle();
		}
		else {
			state = new SuccessState();
			state.handle();
		}
	}
}
