public class Toyota implements Vehicle{
  @Override
  public void choice() {
    System.out.println("\nYou would like a toyota!");
  }

  @Override
  public String typeofvehicle() {
    return "average car";
  }

  @Override
  public int price() {
    return 10000;
  }
}
