/**
 * 
 */
package narif.poc.designpatterns.observer;

import narif.poc.designpatterns.observer.displayelements.impl.CurrentConditionDisplay;
import narif.poc.designpatterns.observer.model.WeatherMeasurements;
import narif.poc.designpatterns.observer.subjects.impl.WeatherData;

/**
 * @author Najeeb
 *
 */
public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		WeatherMeasurements measurements = new WeatherMeasurements(80D, 65D, 30.4D);
		weatherData.setMeasurements(measurements);
	}

}
