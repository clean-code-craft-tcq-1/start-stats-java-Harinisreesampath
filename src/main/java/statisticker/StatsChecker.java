package statisticker;

public class StatsChecker {

	private Float maxThreshold;
	private IAlerter[] alerters;
	StatsChecker(Float maxThreshold,IAlerter [] alerters)
	{
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(Float[] nos) {
		
		EmailAlert e = (EmailAlert) alerters[0];
		LEDAlert l = (LEDAlert) alerters[1];
		
		for(int i=0;i<nos.length;i++)
		{								
				if(nos[i]>maxThreshold)
				{					
					e.alert(true);
					l.alert(true);
					break;
				}
		}
		
	}
	
}
