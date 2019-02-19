package Command;

public class DownCommand implements Command {
	private Person person;
	public DownCommand(Person person) {
		this.person = person;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.person.down();
	}
}
