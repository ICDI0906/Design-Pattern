package builder;

public class Director {
	Builder builder;
	Director(Builder builder){
		this.builder = builder;
	}
	public void construct() {
		builder.buildPart();
	}
}
