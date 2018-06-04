/**
 * 
 */
package narif.poc.designpatterns.observer.subjects.impl;

import java.util.ArrayList;
import java.util.List;

import narif.poc.designpatterns.observer.displayelements.Observer;
import narif.poc.designpatterns.observer.model.WeatherMeasurements;
import narif.poc.designpatterns.observer.subjects.Subject;

/**
 * @author Najeeb
 *
 */
public class WeatherData implements Subject {
	
	private List<Observer> observers;
	private WeatherMeasurements measurements;

	public WeatherData() {
		super();
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if(index>=0)
			observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(o->o.update(measurements));
		/*for(Observer ob:observers)
			ob.update(measurements);*/
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(WeatherMeasurements measurements) {
		this.measurements = measurements;
		measurementsChanged();
	}

}
