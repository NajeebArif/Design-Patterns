/**
 * 
 */
package narif.poc.designpatterns.observer.displayelements.impl;

import narif.poc.designpatterns.observer.displayelements.DisplayElement;
import narif.poc.designpatterns.observer.displayelements.Observer;
import narif.poc.designpatterns.observer.model.WeatherMeasurements;
import narif.poc.designpatterns.observer.subjects.Subject;

/**
 * @author Najeeb
 *
 */
public class ForecastDisplay implements DisplayElement, Observer {

	private Double currentPressure = 29.92D;
	private Double lastPressure;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void unregister() {
		weatherData.removeObserver(this);
	}

	@Override
	public void update(WeatherMeasurements measurements) {
		this.setLastPressure(this.getCurrentPressure());
		this.setCurrentPressure(measurements.getPressure());;
		display();
	}

	@Override
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

	public Double getCurrentPressure() {
		return currentPressure;
	}

	public void setCurrentPressure(Double currentPressure) {
		this.currentPressure = currentPressure;
	}

	public Double getLastPressure() {
		return lastPressure;
	}

	public void setLastPressure(Double lastPressure) {
		this.lastPressure = lastPressure;
	}
	
	

}
