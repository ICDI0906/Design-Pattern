package Chain;

import Chain.Request.RequestType;

public class PlatoonLeader extends RequestHandler {

	public PlatoonLeader(RequestHandler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}
	public void makeHandle(Request req) {
		if(req.getRequestType().equals(RequestType.MIDDLE)) {
			req.makeHandled();
			System.out.println("排长已经处理" + req);
		}
		else {
			super.makeHandle(req);
		}
	}
}
