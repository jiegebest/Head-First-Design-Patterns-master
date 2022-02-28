package designpatterns.behavior11.observer.weather.test;

import designpatterns.behavior11.observer.weather.observer.impl.CurrentConditionsDisplay;
import designpatterns.behavior11.observer.weather.observer.impl.ForecastDisplay;
import designpatterns.behavior11.observer.weather.observer.impl.HeatIndexDisplay;
import designpatterns.behavior11.observer.weather.observer.impl.StatisticsDisplay;
import designpatterns.behavior11.observer.weather.subject.impl.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
