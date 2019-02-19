package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

	public PageComposite getChapter() {
		List<Page> chapter = new ArrayList<>();
		chapter.add(new Page("张开顺"));
		chapter.add(new Page("你好啊"));
		return new Chapter(chapter);
	}
	public PageComposite getBook() {
		List<Chapter> book = new ArrayList<>();
		book.add(new Chapter(Arrays.asList(new Page("张开顺"),new Page("你好"))));
		book.add(new Chapter(Arrays.asList(new Page("你是谁"),new Page("你在哪里"))));
		book.add(new Chapter(Arrays.asList(new Page("你是谁"),new Page("你在哪里"))));;
		return new Book(book);
	}

	public static void main(String args[]) {
		PageComposite chapter = new test().getChapter();
		chapter.print();
		chapter.size();
		PageComposite book = new test().getBook();
		book.print();
		book.size();
	}
}
