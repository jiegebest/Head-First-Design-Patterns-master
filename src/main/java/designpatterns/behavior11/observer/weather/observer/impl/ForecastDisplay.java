package designpatterns.behavior11.observer.weather.observer.impl;

import designpatterns.behavior11.observer.weather.subject.Subject;
import designpatterns.behavior11.observer.weather.observer.Observer;
import designpatterns.behavior11.observer.weather.service.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Subject subject;

	public ForecastDisplay(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
