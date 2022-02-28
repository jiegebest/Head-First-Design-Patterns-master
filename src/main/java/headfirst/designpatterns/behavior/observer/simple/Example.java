package headfirst.designpatterns.behavior.observer.simple;

import headfirst.designpatterns.behavior.observer.simple.observer.impl.SimpleObserver;
import headfirst.designpatterns.behavior.observer.simple.subject.impl.SimpleSubject;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
		simpleSubject.setValue(80);
		simpleSubject.removeObserver(simpleObserver);
	}
}
