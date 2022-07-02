package stereotypeannotations;

import org.springframework.beans.factory.annotation.Required;

public abstract class Heart {

	public String heartRate;

	@Required
	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}

	public String getHeartRate() {
		return heartRate;
	}

}
