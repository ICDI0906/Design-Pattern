package Bridge;

public class CowBullpen extends Bullpen{

	public CowBullpen(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void OnSomeDay() {
		// TODO Auto-generated method stub
		System.out.println(animal.getName() + "在奶牛棚中");
	}

}
