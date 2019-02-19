package Prototype;

public class Prototype implements Cloneable{
	public Prototype clone() {
		Prototype clone = null;
		try {
			clone = (Prototype)super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
		return clone;
	}
	public void print() {
		System.out.println("in prototype");
	}
}
