package Interpreter;
import java.util.HashMap;
import java.util.Map;
public class test {
	public static void main(String args[]) {
		Map<String,Integer> mp = new HashMap<>();
		mp.put("一", 1);mp.put("二", 2);
		mp.put("三", 3);mp.put("四", 4);
		mp.put("五", 5);mp.put("六", 6);
		mp.put("七", 7);mp.put("八", 8);
		mp.put("九", 9);mp.put("十", 10);
		Context context = new Context(mp);
		String number = "一二三四五六七八九十";
		for(int i=0;i<number.length();i++) {
			String tmp = number.substring(i, i + 1);
			AbstractExpression ae = new TerminalExpression(tmp);			
			System.out.print(ae.interpreter(context));
		}
	}
}
