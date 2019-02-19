package Bridge;
public class test {
	public static void main(String args[]) {
		Animal animal = new Cow();
		Bullpen bullpen = new CowBullpen(animal);
		bullpen.OnSomeDay();
		
		Animal animal1 = new DomesticCattle();
		Bullpen bullpen1= new CowBullpen(animal1);
		bullpen1.OnSomeDay();
	}
}
