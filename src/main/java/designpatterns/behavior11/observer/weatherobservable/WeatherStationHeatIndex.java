package designpatterns.behavior11.observer.weatherobservable;

import designpatterns.behavior11.observer.weatherobservable.observer.CurrentConditionsDisplay;
import designpatterns.behavior11.observer.weatherobservable.observer.ForecastDisplay;
import designpatterns.behavior11.observer.weatherobservable.observer.HeatIndexDisplay;
import designpatterns.behavior11.observer.weatherobservable.observer.StatisticsDisplay;
import designpatterns.behavior11.observer.weatherobservable.subject.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
