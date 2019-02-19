package Builder;

public class PersonBuilder implements Builder {
	private Person person;
	
	public PersonBuilder(){
		person =  new Person();
	}
	@Override
	public void buildPart() {
		// TODO Auto-generated method stub
		person.addHeight(1.1);
		person.addName("zhang");
	}
	public Person getResult() {
		return person;
	}
}
