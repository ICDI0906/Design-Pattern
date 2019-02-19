package abstract_factory;

public class LiNingFactory implements ShoesFactory {

	@Override
	public Laces createLaces() {
		// TODO Auto-generated method stub
		return new LiNingLaces();
	}

	@Override
	public Soles createSoles() {
		// TODO Auto-generated method stub
		return new LiNingSoles();
	}

	@Override
	public Uppers createUppers() {
		// TODO Auto-generated method stub
		return new LiNingUppers();
	}

}
