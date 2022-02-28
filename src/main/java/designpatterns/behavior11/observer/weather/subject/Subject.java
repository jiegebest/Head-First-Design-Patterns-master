package designpatterns.behavior11.observer.weather.subject;

import designpatterns.behavior11.observer.weather.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
