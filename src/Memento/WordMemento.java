package Memento;

public class WordMemento implements Notebook {
	private String content;
	public WordMemento(String content) {
		this.setContent(content);
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
