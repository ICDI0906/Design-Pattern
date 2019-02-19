package Strategy;

public class test {
	public static void main(String args[]) {
		Data data = new Data(new DecisionTreeStrategy());
		data.classify();
		data.changeStrategy(new LogicRegressionStrategy());
		data.classify();
	}
}
