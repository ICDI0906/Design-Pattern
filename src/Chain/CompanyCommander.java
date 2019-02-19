package Chain;

import Chain.Request.RequestType;

public class CompanyCommander extends RequestHandler {

	public CompanyCommander(RequestHandler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}
	public void makeHandle(Request req) {
		if(req.getRequestType().equals(RequestType.BIG)) {
			req.makeHandled();
			System.out.println("连长已经处理" + req);
		}
		else {
			super.makeHandle(req);
		}
	}
}
