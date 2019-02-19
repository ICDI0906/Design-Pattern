package Composite;

import java.util.List;

public class Book extends PageComposite {
	public Book(List<Chapter> chapter) {
		for(Chapter c:chapter)
			this.add(c);
	}
}
