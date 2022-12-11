import java.io.IOException;

public class Province extends Location {

  private String locationName            = null;
  private String provinceLocationAddress = null;
  private Double locationLatitude        = null;
  private Double locationLongitude       = null;

  public Province() {}

  public Province(String locationName, String provinceLocationAddress) {
    super(locationName);
    this.provinceLocationAddress = provinceLocationAddress;
  }

  public Province(String locationName, Double locationLatitude, Double locationLongitude) {
    super(locationName, locationLatitude, locationLongitude);
  }
  
  public void setProvinceLocationAddress(String provinceLocationAddress) {
    this.provinceLocationAddress = provinceLocationAddress;
  }
  public String getProvinceLocationAddress() {
    return this.provinceLocationAddress;
  }

  @Override
  public String getLocationType() {
    return "Province";
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
    provinceLocationAddress = input.readLine();
    setProvinceLocationAddress(provinceLocationAddress);
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
    System.out.println("Location Address  : " + getProvinceLocationAddress());
    System.out.println("Location Latitude : " + getLocationLatitude());
    System.out.println("Location Longitude: " + getLocationLongitude());
  }
  
}
