package Iterator;

public class Item {
	private String name;
	private int age;
	public Item(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return name + " " + String.valueOf(age);
	}
}
