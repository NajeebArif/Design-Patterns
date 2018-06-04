/**
 * 
 */
package narif.poc.designpatterns.observer.subjects;

import narif.poc.designpatterns.observer.displayelements.Observer;

/**
 * @author Najeeb
 *
 */
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

}
