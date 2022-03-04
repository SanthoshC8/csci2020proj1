public class VehicleFactory {
  public static Vehicle getVehicle(String vehicleType){
    if(vehicleType == null){
         return null;
    }
    if(vehicleType.equalsIgnoreCase("Mercedes")){
         return new Mercedes();

    } else if(vehicleType.equalsIgnoreCase("Toyota")){
         return new Toyota();

    } else if(vehicleType.equalsIgnoreCase("Harleydavidson")){
         return new Harleydavidson();
    }

      return null;
  }
}
