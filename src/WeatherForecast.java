import java.util.Vector;

public class WeatherForecast {
  
  private City city         = null;
  private Province province = null;
  private String date       = null;

  private Double temperature   = null;
  private Double humidity      = null;
  private Double precipitation = null;
  private Double windSpeed     = null;
  private Double windDirection = null;
  private Double cloudCover    = null;

  private String weatherCondition = null;

  private Vector<String> weatherForecast = null;
  private Vector<String> weatherData     = null;

  public WeatherForecast(City city, String date) {
    
    this.city = new City();
    this.date = date;

    this.weatherForecast = new Vector<String>();
    this.weatherData     = new Vector<String>();

    simulateWeatherForecast();

  }

  public WeatherForecast(Province province, String date) {

    this.province = new Province();
    this.date     = date;

    this.weatherForecast = new Vector<String>();
    this.weatherData     = new Vector<String>();

    simulateWeatherForecast();

  }

  private void simulateWeatherForecast() {

    for(int hour = 0; hour != 24; ++hour) {

      temperature   = Math.round(((double)(Math.random() * 100.00D)) * 100D) / 100D;
      humidity      = Math.round(((double)(Math.random() * 100.00D)) * 100D) / 100D;
      precipitation = Math.round(((double)(Math.random() * 100.00D)) * 100D) / 100D;
      windSpeed     = Math.round(((double)(Math.random() * 100.00D)) * 100D) / 100D;
      windDirection = Math.round(((double)(Math.random() * 100.00D)) * 100D) / 100D;
      cloudCover    = Math.round(((double)(Math.random() * 100.00D)) * 100D) / 100D;
      
      if(temperature > 80 && humidity > 50 && precipitation == 0 && windSpeed < 10 && cloudCover < 30) {
        weatherCondition = "Sunny";
        weatherForecast.add(weatherCondition);
      }
      else if(temperature > 60 && humidity > 40 && precipitation > 0 && windSpeed > 20 && cloudCover > 70) {
        weatherCondition = "Stormy";
        weatherForecast.add(weatherCondition);
      }
      else if(temperature > 40 && humidity > 30 && precipitation == 0 && windSpeed > 10) {
        weatherCondition = "Windy";
        weatherForecast.add(weatherCondition);        
      }
      else if(temperature > 40 && humidity > 30 && precipitation == 0 && windSpeed > 10 && cloudCover > 30 && cloudCover < 70) {
        weatherCondition = "Cloudy";
        weatherForecast.add(weatherCondition);        
      }
      else if(temperature > 60 && humidity > 40 && precipitation > 0) {
        weatherCondition = "Rainy";
        weatherForecast.add(weatherCondition);
      }
      else {
        weatherCondition = "Partly Cloudy";
        weatherForecast.add(weatherCondition);
      }

      weatherData.add(weatherInfo(hour));

    }

  }

  public String getDate() {
    return date;
  }

  private String weatherInfo(Integer hour) {
    return 
      "[Hour - " + (hour + 1) + ":00] Temperature: " + temperature.toString() + 
      "°F, Humidity: " + humidity.toString() + "%, Precipitation: " + precipitation.toString() + 
      "%, Wind Speed: " + windSpeed.toString() + "%, Wind Direction: " + windDirection.toString() +
      "%, Cloud Cover: " + cloudCover.toString() + "%. (" + weatherForecast.get(hour) + ")";
  }

  public void showWeatherForecastInADay() {
    if(city != null) {
      System.out.println("Date              : " + getDate());
      for(final String data : weatherData) {
        System.out.println(data);
      }
    }
    if(province != null) {
      System.out.println("Date              : " + getDate());
      for(final String data : weatherData) {
        System.out.println(data);
      }
    }
  }

}
