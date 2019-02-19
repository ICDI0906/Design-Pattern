package Bridge;

public class DomesticCattleBullpen extends Bullpen {

	public DomesticCattleBullpen(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void OnSomeDay() {
		// TODO Auto-generated method stub
		System.out.println(animal.getName() + "在家牛棚中");
	}

}
