import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Location {
  
  private String locationName      = null;
  private Double locationLatitude  = null;
  private Double locationLongitude = null;

  protected final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

  public Location() {}

  public Location(String locationName) {
    this.locationName = locationName;
  }

  public Location(String locationName, Double locationLatitude, Double locationLongitude) {
    this.locationName = locationName;
    this.locationLatitude = locationLatitude;
    this.locationLongitude = locationLongitude;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }
  public String getLocationName() {
    return this.locationName;
  }

  public void setLocationLatitude(Double locationLatitude) {
    this.locationLatitude = locationLatitude;
  }
  public Double getLocationLatitude() {
    return this.locationLatitude;
  }
  
  public void setLocationLongitude(Double locationLongitude) {
    this.locationLongitude = locationLongitude;
  }
  public Double getLocationLongitude() {
    return this.locationLongitude;
  }

  public abstract String getLocationType();

  public abstract void inputLocationName() throws IOException;
  public abstract void inputLocationAddress() throws IOException;
  public abstract void inputLocationLatitude();
  public abstract void inputLocationLongitude();

  public abstract void showLocationInfo();

}
