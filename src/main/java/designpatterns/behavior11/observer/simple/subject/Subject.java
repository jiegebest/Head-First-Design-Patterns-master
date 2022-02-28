package designpatterns.behavior11.observer.simple.subject;

import designpatterns.behavior11.observer.simple.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
