package Adapter;

public class SignalAdapter implements SignalTransfer {
	private DigitalSignal ds;
	public SignalAdapter() {
		ds = new DigitalSignal();
	}
	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		ds.transfer();
	}

}
