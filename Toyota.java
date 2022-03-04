public class Toyota implements Vehicle{ //Toyota product or subclass
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
