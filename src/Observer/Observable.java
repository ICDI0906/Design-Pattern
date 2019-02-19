package Observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Observable<S extends Observable<S,O,A>,O extends Observer<S,O,A>,A> {
	private List<O> observers;
	public Observable() {
		this.observers = new CopyOnWriteArrayList<>();
	}
	public void addObserver(O observer) {
		this.observers.add(observer);
	}
	public void removeObserver(O observer) {
		this.observers.remove(observer);
	}
	public void notify(A argument) {
		for(O observer:observers) {
			observer.update(argument);
		}
	}
}
