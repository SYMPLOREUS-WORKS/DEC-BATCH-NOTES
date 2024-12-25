package com.bharath.oops.designpatterns;

import java.util.ArrayList;
import java.util.List;

interface Subject {
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}

interface Observer {
	void update(float temperature, float humidity, float pressure);
}

class WeatherStation implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherStation() {
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
}

class CurrentConditionsDisplay implements Observer {
	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out
				.println("Current conditions: " + temperature + "°C, " + humidity + "% humidity, " + pressure + " Pa");
	}
}

class ForecastDisplay implements Observer {
	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("Forecast: Temperature may rise to " + (temperature + 1) + "°C");
	}
}

public class ObserverPatternDemo {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();

		Observer currentDisplay = new CurrentConditionsDisplay();
		Observer forecastDisplay = new ForecastDisplay();

		weatherStation.addObserver(currentDisplay);
		weatherStation.addObserver(forecastDisplay);

		// Simulate changing weather conditions
		weatherStation.setMeasurements(25.0f, 65.0f, 1013.0f);
		weatherStation.setMeasurements(30.0f, 70.0f, 1009.0f);
	}
}
