package headfirst.designpatterns.observer.weatherobservable.subject;
	
import lombok.NoArgsConstructor;

import java.util.Observable;

@NoArgsConstructor
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}