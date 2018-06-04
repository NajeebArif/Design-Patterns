/**
 * 
 */
package narif.poc.designpatterns.observer.displayelements;

import narif.poc.designpatterns.observer.model.WeatherMeasurements;

/**
 * @author Najeeb
 *
 */
public interface Observer {
	
	public void update(WeatherMeasurements measurements);
	public void unregister();

}
