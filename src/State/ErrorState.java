package State;

public class ErrorState implements State {
	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("返回404页面");
	}
}
