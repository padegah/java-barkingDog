public class barkingDog 
{
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay)
	{
		boolean wake = false;
		
		//check for invalid time of day
		if(hourOfDay < 0 && hourOfDay > 23)
		{
			wake = false;
		}
		
		//check for valid time of day
		else if (hourOfDay >= 0 && hourOfDay <= 23)
		{
			if (barking == true)
			{
				//check if hour of day is before 8 and after 22
				if (hourOfDay < 8 || hourOfDay > 22)
					wake = true;
				else
					wake = false;
			}
		}
		
		return wake;
	}
}
