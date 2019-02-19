package Bridge;

public abstract class Bullpen {
	protected Animal animal;
	public Bullpen(Animal animal) { 
		this.animal = animal; // this 指向抽象类的子类
	}
	abstract public void OnSomeDay();
}
