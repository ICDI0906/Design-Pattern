package Memento;

public class Word {
	private String content;
	public Word(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Notebook save() {
		return new WordMemento(content);
	}
	public void restore(Notebook notebook) {
		WordMemento wordMemento = (WordMemento) notebook;
		this.content = wordMemento.getContent();
	}
	public String toString() {
		return content;
	}
}
