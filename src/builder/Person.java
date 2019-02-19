package Builder;
/*
 * 使用建造者模式创建人物
 */
public class Person {
	private String name;
	private double height;
	private double weight;
//	public Person(Builder builder) {
//		this.name = builder.name;
//		this.height = builder.height;
//		this.weight = builder.weight;
//	}
	
	public String toString() {
		return "name is " + name + " height is " + String.valueOf(height) + " weight is " + String.valueOf(weight);
	}
	public void addName(String name) {
		this.name = name;
	}
	public void addHeight(double height) {
		this.height = height;
	}
	public void addWeight(double weight) {
		this.weight = weight;
	}
	/*
	public static class Builder{
		private String name;
		private double height;
		private double weight;
		public Builder(String name) {
			this.name = name;
		}
		public Builder addHeight(double height) {
			this.height = height;
			return this;
		}
		public Builder addWeight(double weight) {
			this.weight = weight;
			return this;
		}
		public Person build() {
			return new Person(this);
		}
	}
	*/
}
