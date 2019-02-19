package Interpreter;
import java.util.Map;
public class Context {
	private Map<String,Integer> mp;
	public Context(Map<String,Integer> mp) {
		this.setMp(mp);
	}
	public Map<String,Integer> getMp() {
		return mp;
	}
	public void setMp(Map<String,Integer> mp) {
		this.mp = mp;
	}
}
