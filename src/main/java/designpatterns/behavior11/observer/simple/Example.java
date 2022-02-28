package designpatterns.behavior11.observer.simple;

import designpatterns.behavior11.observer.simple.observer.impl.SimpleObserver;
import designpatterns.behavior11.observer.simple.subject.impl.SimpleSubject;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
		simpleSubject.setValue(80);
		simpleSubject.removeObserver(simpleObserver);
	}
}
