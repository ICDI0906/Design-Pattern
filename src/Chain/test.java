package Chain;

import Chain.Request.RequestType;

public class test {
	public static void main(String args[]) {
		Commander command = new Commander();
		Request req = new Request(RequestType.BIG,"发给连长的命令!");
		command.makeCommand(req);
		req = new Request(RequestType.MIDDLE,"发给排长的命令!");
		command.makeCommand(req);
		req = new Request(RequestType.SMALL,"发给班长的命令!");
		command.makeCommand(req);
	}
}
