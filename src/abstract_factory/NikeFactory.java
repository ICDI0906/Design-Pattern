package abstract_factory;

public class NikeFactory implements ShoesFactory {

	@Override
	public Laces createLaces() {
		// TODO Auto-generated method stub
		return new NikeLaces();
	}

	@Override
	public Soles createSoles() {
		// TODO Auto-generated method stub
		return new NikeSoles();
	}

	@Override
	public Uppers createUppers() {
		// TODO Auto-generated method stub
		return new NikeUppers();
	}

}
