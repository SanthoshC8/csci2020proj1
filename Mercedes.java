public class Mercedes implements Vehicle{
  @Override
  public void choice() {
    System.out.println("\nYou would like a mercedes benz!");
  }

  @Override
  public String typeofvehicle() {
    return "luxury car";
  }

  @Override
  public int price() {
    return 120000;
  }
}
