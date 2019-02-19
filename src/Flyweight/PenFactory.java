package Flyweight;

import java.util.EnumMap;
import java.util.Map;

public class PenFactory {
	private final Map<PenType,Pen> pens;
	public PenFactory() {
		pens = new EnumMap<>(PenType.class);
	}
	public Pen createPen(PenType type) {
		Pen p = pens.get(type);
		if(p == null) {
			switch(type) {
			case RED:
				p = new RedPen();
				pens.put(type, p);
				break;
			case BLACK:
				p = new BlackPen();
				pens.put(type,p);
				break;
			}
		}
		return p; 
		}
}
