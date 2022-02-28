package headfirst.designpatterns.observer.weather.observer.impl;

import headfirst.designpatterns.observer.weather.observer.Observer;
import headfirst.designpatterns.observer.weather.service.DisplayElement;
import headfirst.designpatterns.observer.weather.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private Subject subject;

	public StatisticsDisplay(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		if (temp < minTemp) {
			minTemp = temp;
		}
		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}
}