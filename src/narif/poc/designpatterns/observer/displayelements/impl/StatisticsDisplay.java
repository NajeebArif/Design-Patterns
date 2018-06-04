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
public class StatisticsDisplay implements DisplayElement, Observer {
	
	private Double maxTemp = 0.0D;
	private Double minTemp = 200D;
	private Double tempSum= 0.0D;
	private int numReadings;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		
	}

	@Override
	public void unregister() {
		weatherData.removeObserver(this);
	}
	

	@Override
	public void update(WeatherMeasurements measurements) {
		tempSum += measurements.getTemp();
		numReadings++;
		if (measurements.getTemp() > getMaxTemp()) {
			setMaxTemp(measurements.getTemp());
		}
		if (measurements.getTemp() < getMinTemp()) {
			setMinTemp(measurements.getTemp());
		}
		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + getMaxTemp() + "/" + getMinTemp());
	}

	public Double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(Double maxTemp) {
		this.maxTemp = maxTemp;
	}

	public Double getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(Double minTemp) {
		this.minTemp = minTemp;
	}

	public Double getTempSum() {
		return tempSum;
	}

	public void setTempSum(Double tempSum) {
		this.tempSum = tempSum;
	}

	public int getNumReadings() {
		return numReadings;
	}

	public void setNumReadings(int numReadings) {
		this.numReadings = numReadings;
	}
	
	

}
