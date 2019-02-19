package Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class PageComposite {
	private List<PageComposite> son = new ArrayList<>();
	public void add(PageComposite children) {
		this.son.add(children);
	}
	public void size() {
		System.out.println(son.size());
	}
	void print() {
		for(PageComposite pc :son) {
			pc.print();
		}
	}
}
