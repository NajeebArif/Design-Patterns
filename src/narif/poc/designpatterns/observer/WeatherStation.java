/**
 * 
 */
package narif.poc.designpatterns.observer;

import java.util.Arrays;
import java.util.stream.Stream;

import narif.poc.designpatterns.observer.displayelements.impl.CurrentConditionDisplay;
import narif.poc.designpatterns.observer.displayelements.impl.ForecastDisplay;
import narif.poc.designpatterns.observer.displayelements.impl.StatisticsDisplay;
import narif.poc.designpatterns.observer.model.WeatherMeasurements;
import narif.poc.designpatterns.observer.subjects.Subject;
import narif.poc.designpatterns.observer.subjects.impl.WeatherData;

/**
 * @author Najeeb
 *
 */
public class WeatherStation {
	
	public static void main(String[] args) {
		final WeatherData weatherData = new WeatherData();
		registerObservers(weatherData);
		getMeasurements()
			.forEach(measurements->weatherData.setMeasurements(measurements));
	}
	
	private static void registerObservers(Subject subject) {
		new CurrentConditionDisplay(subject);
		new ForecastDisplay(subject);
		new StatisticsDisplay(subject);
	}
	
	private static Stream<WeatherMeasurements> getMeasurements(){
		return Arrays
				.asList(new WeatherMeasurements(80D, 65D, 30.4D),
						new WeatherMeasurements(30D, 75D, 20.4D),
						new WeatherMeasurements(90D, 55D, 40.6D))
				.stream();
	}

}
