import parkingFeeCalculator.ParkingFeeCalculator;

public class VehicalFactoryPattern {

    public static Vehicle creatVehical(String Vehicaltype, String licensePlate,
            ParkingFeeCalculator parkingFeeCalculator) {

        if (Vehicaltype.equalsIgnoreCase("car")) {
            return new Car(licensePlate, Vehicaltype, parkingFeeCalculator);
        } else if (Vehicaltype.equalsIgnoreCase("bike")) {
            return new Bike(licensePlate, Vehicaltype, parkingFeeCalculator);
        } else if (Vehicaltype.equalsIgnoreCase("cycle")) {
            return new Cycle(licensePlate, Vehicaltype, parkingFeeCalculator);
        }

        return new OtherVehical(licensePlate, Vehicaltype, parkingFeeCalculator);
    }

}