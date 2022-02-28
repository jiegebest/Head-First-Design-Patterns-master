package headfirst.designpatterns.observer.weatherobservable;

import headfirst.designpatterns.observer.weatherobservable.observer.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.weatherobservable.observer.ForecastDisplay;
import headfirst.designpatterns.observer.weatherobservable.observer.StatisticsDisplay;
import headfirst.designpatterns.observer.weatherobservable.subject.WeatherData;

import java.util.Observable;
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
