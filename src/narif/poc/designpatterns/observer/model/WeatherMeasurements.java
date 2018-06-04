/**
 * 
 */
package narif.poc.designpatterns.observer.model;

/**
 * @author Najeeb
 *
 */
public class WeatherMeasurements {
	private final Double temp;
	private final Double humidity;
	private final Double pressure;
	
	public WeatherMeasurements(Double temp, Double humidity, Double pressure) {
		super();
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public Double getTemp() {
		return temp;
	}

	public Double getHumidity() {
		return humidity;
	}

	public Double getPressure() {
		return pressure;
	}

	@Override
	public String toString() {
		return "WeatherMeasurements [temp=" + temp + ", humidity=" + humidity + ", pressure=" + pressure + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((humidity == null) ? 0 : humidity.hashCode());
		result = prime * result + ((pressure == null) ? 0 : pressure.hashCode());
		result = prime * result + ((temp == null) ? 0 : temp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherMeasurements other = (WeatherMeasurements) obj;
		if (humidity == null) {
			if (other.humidity != null)
				return false;
		} else if (!humidity.equals(other.humidity))
			return false;
		if (pressure == null) {
			if (other.pressure != null)
				return false;
		} else if (!pressure.equals(other.pressure))
			return false;
		if (temp == null) {
			if (other.temp != null)
				return false;
		} else if (!temp.equals(other.temp))
			return false;
		return true;
	}
	
	

}
