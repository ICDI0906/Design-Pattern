package Composite;

import java.util.List;

public class Chapter extends PageComposite {
	public Chapter(List<Page> page) {
		for(Page p: page) {
			this.add(p);
		}
	}
}
