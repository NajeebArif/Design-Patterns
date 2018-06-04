/**
 * 
 */
package narif.poc.designpatterns.observer;

import java.util.Arrays;
import java.util.stream.Stream;

import narif.poc.designpatterns.observer.displayelements.impl.CurrentConditionDisplay;
import narif.poc.designpatterns.observer.model.WeatherMeasurements;
import narif.poc.designpatterns.observer.subjects.impl.WeatherData;

/**
 * @author Najeeb
 *
 */
public class WeatherStation {
	
	public static void main(String[] args) {
		final WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		getMeasurements()
			.forEach(measurements->weatherData.setMeasurements(measurements));
	}
	
	private static Stream<WeatherMeasurements> getMeasurements(){
		return Arrays
				.asList(new WeatherMeasurements(80D, 65D, 30.4D))
				.stream();
	}

}
