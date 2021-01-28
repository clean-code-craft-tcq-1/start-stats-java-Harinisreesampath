package statisticker;

public class EmailAlert implements IAlerter{

	public static boolean emailSent;

	public void alert(boolean emailSent)
	{
		EmailAlert.emailSent = emailSent;
	}

}
