package es.islomar.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private List<Observer> observersList;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observersList = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer e) {
		observersList.add(e);
	}

	public void removeObserver(Observer e) {
		int i = observersList.indexOf(e);
		if (i >= 0) {
			observersList.remove(i);
		}
		
	}

	public void notifyObservers() {
		for (int i = 0; i < observersList.size(); i++) {
			Observer observer = observersList.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	private void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
