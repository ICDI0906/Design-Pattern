package Chain;

public abstract class RequestHandler {
	private RequestHandler next;
	public RequestHandler(RequestHandler handler) {
		this.next = handler;
	}
	public void makeHandle(Request req) {
		if(next != null) {
			next.makeHandle(req);
		}
	}
}
