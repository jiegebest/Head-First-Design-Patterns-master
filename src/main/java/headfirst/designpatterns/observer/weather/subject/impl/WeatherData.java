package headfirst.designpatterns.observer.weather.subject.impl;

import headfirst.designpatterns.observer.weather.observer.Observer;
import headfirst.designpatterns.observer.weather.subject.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private float temperature;
	private float humidity;
	private float pressure;

	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

}
