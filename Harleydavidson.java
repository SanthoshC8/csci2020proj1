public class Harleydavidson implements Vehicle{
  @Override
  public void choice() {
    System.out.println("\nYou would like a harley-davidson!");
  }

  @Override
  public String typeofvehicle() {
    return "motorcycle";
  }

  @Override
  public int price() {
    return 15000;
  }
}
