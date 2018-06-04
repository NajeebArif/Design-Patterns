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
	
	private Subject weatherData;
	
	@Override
	public void unregister() {
		weatherData.removeObserver(this);
	}
	

	@Override
	public void update(WeatherMeasurements measurements) {
	}

	@Override
	public void display() {
	}

}
