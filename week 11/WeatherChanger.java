import java.util.*;


public class WeatherChanger {
	
	enum WeatherCondition {SUNNY, OVERCAST, RAINING};
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		boolean iWantToQuit = false;
		
		Scanner sc = new Scanner (System.in);
		
		WeatherCondition currentWeather = WeatherCondition.OVERCAST;
		
		do
		{
		
			System.out.println("Current weather condition is " + currentWeather);
			
			System.out.println("Press i to improve or w to worsen the weather: ");
			
			String input = sc.nextLine();
			
			switch (input.charAt(0))
			{
			case 'w':
				System.out.println("Worsen the weather");
				currentWeather = worsenWeather(currentWeather);
				break;
			case 'i':
				System.out.println("Improve the weather");
				currentWeather = improveWeather(currentWeather);
				break;
			default:
				iWantToQuit = true;
				System.out.println("Quit the program");
				
			}
				System.out.println("The current weather is now " + currentWeather);
		} while (iWantToQuit == false);

	}// end of main
	
	public static WeatherCondition improveWeather (WeatherCondition wc)
	{
		switch (wc)
		{
			case RAINING:
				return WeatherCondition.OVERCAST;
			default:
				return WeatherCondition.SUNNY;
		}
	
	}// end of improveWeather
	
	public static WeatherCondition worsenWeather (WeatherCondition wc)
	{
		switch (wc)
		{
			case SUNNY:
				return WeatherCondition.OVERCAST;
			default:
				return WeatherCondition.RAINING;
		}
	}//end of worsenWeather
}
