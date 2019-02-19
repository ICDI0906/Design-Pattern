package Memento;

public class test {
	public static void main(String args[]) {
		WordCareTaker taker = new WordCareTaker();
		Word word = new Word("上次的信息");
		taker.setHistory(word.save());
		word.setContent("这次的信息");
		System.out.println(word);
		word.restore(taker.getHistory());
		System.out.println(word);
	}
}
