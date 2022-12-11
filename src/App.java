public class App {

  public static void main(String[] args) throws Exception {
        
    City regionNCR = new City();
    regionNCR.setLocationName("Quezon City");
    regionNCR.setCityLocationAddress("Philcoa");

    Province region4A = new Province("Candelaria, Quezon", "395 Ramos Street Barangay Poblacion");
        
    WeatherForecast inRegionNCR = new WeatherForecast(regionNCR, "Sunday, 11 December 2022");
    WeatherForecast inRegion4A = new WeatherForecast(region4A, "Sunday, 11 December 2022");

    regionNCR.showLocationInfo();
    inRegionNCR.showWeatherForecastInADay();

    region4A.showLocationInfo();
    inRegion4A.showWeatherForecastInADay();
        
  }

}
