package Mediator;

import java.util.*;

public class WeiXinGroup implements Group{
	private final List<People> list;
	public WeiXinGroup() {
		list = new ArrayList<>();
	}
	@Override
	public void addGroup(People p) {
		// TODO Auto-generated method stub
		this.list.add(p);
		p.addGroup(this);
	}

	@Override
	public void act(People people, Action action) {
		// TODO Auto-generated method stub
		for(People p : this.list) {
			if(!people.equals(p))
				p.receive(action);
		}
	}
}
