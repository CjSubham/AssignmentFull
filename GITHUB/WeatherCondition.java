package GITHUB;
class weather
{
	String Country;
	String Place;
	String WeatherType;
	float rainfall;
	int windSpeed;

	weather(String c, String p, String w, float r, int ws)
		{
	Country=c;
	Place=p;
	WeatherType=w;
	rainfall=r;
	windSpeed=ws;
		}
	}
	
		
public class WeatherCondition {

	public static void main(String[] args) {
		weather w1=new weather ("India","Rourkela","Rainy",0.1f,50);
		System.out.println("Country="+w1. Country);
		System.out.println("Place="+w1. Place);
		System.out.println("WeatherType="+w1. WeatherType);
		System.out.println("Rainfall="+w1. rainfall);
		System.out.println("Windspeed="+w1. windSpeed);
		System.out.println("========================================");
		weather w2=new weather ("India","Barbil","Cloudy",0f,10);
		System.out.println("Country="+w2. Country);
		System.out.println("Place="+w2. Place);
		System.out.println("WeatherType="+w2. WeatherType);
		System.out.println("Rainfall="+w2. rainfall);
		System.out.println("Windspeed="+w2. windSpeed);
		System.out.println("========================================");
		weather w3=new weather ("China","Bejing","Thunderstorm",5f,100);
		System.out.println("Country="+w3. Country);
		System.out.println("Place="+w3. Place);
		System.out.println("WeatherType="+w3. WeatherType);
		System.out.println("Rainfall="+w3. rainfall);
		System.out.println("Windspeed="+w3. windSpeed);


	}

}
