package Command;

public class UpCommand implements Command {
	private Person person;
	public UpCommand(Person person) {
		this.person = person;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.person.up();
	}
	
}
