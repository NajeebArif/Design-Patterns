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
public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private Double temp;
	private Double humidity;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions: "+temp+"F degrees and "+humidity+"% humidity.");
	}

	@Override
	public void update(WeatherMeasurements measurements) {
		this.setTemp(measurements.getTemp());
		this.setHumidity(measurements.getHumidity());
		display();
	}
	
	@Override
	public void unregister() {
		this.weatherData.removeObserver(this);
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}
	
	

}
