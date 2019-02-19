package Chain;

public class Commander {
	RequestHandler handler;
	public Commander() {
		this.handler = new CompanyCommander(new PlatoonLeader(new Monitor(null)));
	}
	public void makeCommand(Request req) {
		this.handler.makeHandle(req);
	}
}
