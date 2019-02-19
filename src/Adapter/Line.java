package Adapter;

public class Line implements SignalTransfer {
	private SignalTransfer signal;
	public Line(SignalTransfer signalTransfer) {
		signal = signalTransfer;
	}
	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		signal.transfer();
	}
}
