package abstract_factory;

public class FactoryMaker {
	public static ShoesFactory makeFactory(String type) {
		if(type.equals("LiNing")) {
			return new LiNingFactory();
		}
		else{
			return new NikeFactory();
		}
	}
}
