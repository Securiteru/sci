package smartdevices;

public class SecurityCamera extends SmartObjects {

  private boolean status;
  private boolean filmingStatus;
  private static int instanceCount = 0;
  private final float CONSUMPTION = 5;
  private final float FILM_CONSUMPTION = 8;

  public SecurityCamera() {
    instanceCount++;
  }

  public void turnOn() {
    this.status = true;
  }

  public void turnOff() {
    this.status = false;
  }

  public boolean getStatus() {
    return this.status;
  }

  public void turnOnFilming() {
    this.filmingStatus = true;
  }

  public void turnOffFilming() {
    this.filmingStatus = false;
  }

  public float getConsumption() {
    return (status && filmingStatus) ? this.CONSUMPTION + this.FILM_CONSUMPTION : status ? this.CONSUMPTION : 0;
  }

}