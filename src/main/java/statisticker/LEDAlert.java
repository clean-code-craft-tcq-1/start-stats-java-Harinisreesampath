package statisticker;

public class LEDAlert implements IAlerter {

	public static boolean ledGlows;
	
	public void alert(boolean ledGlows)
	{
		LEDAlert.ledGlows = ledGlows;
	}


}
