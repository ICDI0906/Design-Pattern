package abstract_factory;

public class test {
	public static void main (String argc[]) {
		ShoesFactory sf = FactoryMaker.makeFactory("LiNing");
		System.out.println(sf.createLaces().getLacesColor());
		System.out.println(sf.createSoles().getSolesColor());
		
		ShoesFactory sf1 = FactoryMaker.makeFactory("Nike");
		System.out.println(sf1.createLaces().getLacesColor());
		System.out.println(sf1.createSoles().getSolesColor());
	}
}
