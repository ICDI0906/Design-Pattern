package Chain;

public class Request {
	private RequestType requestType;
	private String describe;
	private boolean handled;
	public Request(RequestType type,String describe) {
		this.setRequestType(type);
		this.setDescribe(describe);
	}
	public void makeHandled() {
		this.setHandled(true);
	}
	public RequestType getRequestType() {
		return requestType;
	}
	
	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public boolean isHandled() {
		return handled;
	}
	public void setHandled(boolean handled) {
		this.handled = handled;
	}
	public enum RequestType{
		BIG,MIDDLE,SMALL;
	}
	public String toString() {
		return describe;
	}
}
