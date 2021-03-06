package designpatterns.behavior11.observer.weatherobservable;

import designpatterns.behavior11.observer.weatherobservable.observer.CurrentConditionsDisplay;
import designpatterns.behavior11.observer.weatherobservable.observer.ForecastDisplay;
import designpatterns.behavior11.observer.weatherobservable.observer.StatisticsDisplay;
import designpatterns.behavior11.observer.weatherobservable.subject.WeatherData;

import java.util.Observer;

public class WeatherStation {

	public static void main(String[] args) {
		// set subject
		WeatherData weatherData = new WeatherData();
		// add observers
		Observer currentConditions = new CurrentConditionsDisplay(weatherData);
		Observer statisticsDisplay = new StatisticsDisplay(weatherData);
		Observer forecastDisplay = new ForecastDisplay(weatherData);
		// notifyAll
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
