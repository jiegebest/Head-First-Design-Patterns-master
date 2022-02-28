package headfirst.designpatterns.behavior.observer.simple.subject;

import headfirst.designpatterns.behavior.observer.simple.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
