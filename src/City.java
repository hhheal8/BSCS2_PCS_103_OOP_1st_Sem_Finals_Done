import java.io.IOException;

public class City extends Location {

  private String locationName        = null;
  private String cityLocationAddress = null;
  private Double locationLatitude    = null;
  private Double locationLongitude   = null;

  public City() {}

  public City(String locationName, String cityLocationAddress) {
    super(locationName);
    this.cityLocationAddress = cityLocationAddress;
  }
  
  public City(String locationName, Double locationLatitude, Double locationLongitude) {
    super(locationName, locationLatitude, locationLongitude);
  }

  public void setCityLocationAddress(String cityLocationAddress) {
    this.cityLocationAddress = cityLocationAddress;
  }
  public String getCityLocationAddress() {
    return this.cityLocationAddress;
  }

  @Override
  public String getLocationType() {
    return "City";
  }

  @Override
  public void inputLocationName() throws IOException {
    System.out.print("\nInput " + getLocationType() + " Location Name: ");
    locationName = input.readLine();
    setLocationName(locationName);
  }

  @Override
  public void inputLocationAddress() throws IOException {
    System.out.print("Input " + getLocationType() + " Location Address: ");     
    cityLocationAddress = input.readLine();
    setCityLocationAddress(cityLocationAddress);
  }

  @Override
  public void inputLocationLatitude() {
    while(true) {
      try {
        System.out.print("Input " + getLocationType() + " Location Latitude: ");
        locationLatitude = Double.parseDouble(input.readLine());
        setLocationLatitude(locationLatitude);
        break;
      }
      catch(IOException e) {
        System.err.println("\nInvalid Input/Format. Please try again.");
        continue;
      }
      catch(NumberFormatException e) {
        System.err.println("\nInvalid Input/Format. Please try again.");
        continue;
      }
    }
  }

  @Override
  public void inputLocationLongitude() {
    while(true) {
      try {
        System.out.print("Input " + getLocationType() + " Location Longitude: ");
        locationLongitude = Double.parseDouble(input.readLine());
        setLocationLongitude(locationLongitude);
        break;
      }
      catch(IOException e) {
        System.err.println("\nInvalid Input/Format. Please try again.");
        continue;
      }
      catch(NumberFormatException e) {
        System.err.println("\nInvalid Input/Format. Please try again.");
        continue;
      }
    }
  }

  @Override
  public void showLocationInfo() {
    System.out.println("\nLocation Name     : " + getLocationName() + " " + getLocationType());
    System.out.println("Location Address  : " + getCityLocationAddress());
    System.out.println("Location Latitude : " + getLocationLatitude());
    System.out.println("Location Longitude: " + getLocationLongitude());
  }

}
