package Chain;

import Chain.Request.RequestType;

public class Monitor extends RequestHandler {

	public Monitor(RequestHandler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}
	public void makeHandle(Request req) {
		if(req.getRequestType().equals(RequestType.SMALL)) {
			req.makeHandled();
			System.out.println("班长已经处理" + req);
		}
		else {
			super.makeHandle(req);
		}
	}
}
