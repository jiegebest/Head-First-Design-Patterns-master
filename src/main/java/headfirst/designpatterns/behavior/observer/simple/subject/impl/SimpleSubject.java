package headfirst.designpatterns.behavior.observer.simple.subject.impl;

import headfirst.designpatterns.behavior.observer.simple.observer.Observer;
import headfirst.designpatterns.behavior.observer.simple.subject.Subject;
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