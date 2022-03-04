public class VehicleMaker {

  public static void main(String[] args) {
    VehicleFactory vehicleFactory = new VehicleFactory();

    Vehicle car1 = VehicleFactory.getVehicle("Mercedes");
    Vehicle car2 = VehicleFactory.getVehicle("Toyota");
    Vehicle car3 = VehicleFactory.getVehicle("Harleydavidson");

    car1.choice();
    System.out.printf("This is a "+ car1.typeofvehicle()+ " and it costs $"+car1.price());
    car2.choice();
    System.out.printf("This is a "+ car2.typeofvehicle()+ " and it costs $"+car2.price());
    car3.choice();
    System.out.printf("This is a "+ car3.typeofvehicle()+ " and it costs $"+car3.price());
  }
}
