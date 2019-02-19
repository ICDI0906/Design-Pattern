package Strategy;

public class Data {
	private Strategy strategy;
	public Data(Strategy strategy) {
		this.strategy = strategy;
	}
	public void changeStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void classify() {
		this.strategy.classify();
	}
}
