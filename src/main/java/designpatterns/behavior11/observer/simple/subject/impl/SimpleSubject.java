package designpatterns.behavior11.observer.simple.subject.impl;

import designpatterns.behavior11.observer.simple.observer.Observer;
import designpatterns.behavior11.observer.simple.subject.Subject;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class SimpleSubject implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private int value = 0;

	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
}