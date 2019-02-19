package builder;
public class test {
	public static void main(String args[]) {
//		Person p1 = new Person.Builder("zhang").build();
//		System.out.println(p1.toString());
//		Person p2 = new Person.Builder("kai").addHeight(1.4).build();
//		System.out.println(p2.toString());
		Builder builder = new PersonBuilder();
		Director director = new Director(builder);
		director.construct();
		System.out.println(builder.getResult());
	}
}
