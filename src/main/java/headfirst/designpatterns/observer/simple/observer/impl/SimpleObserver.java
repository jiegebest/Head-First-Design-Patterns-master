package headfirst.designpatterns.observer.simple.observer.impl;

import headfirst.designpatterns.observer.simple.observer.Observer;
import headfirst.designpatterns.observer.simple.subject.Subject;

public class SimpleObserver implements Observer {
	private int value;
	private Subject simpleSubject;
	
	public SimpleObserver(Subject simpleSubject) {
		this.simpleSubject = simpleSubject;
		simpleSubject.registerObserver(this);
	}
	
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println("Value: " + value);
	}
}
