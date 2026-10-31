package vehicle;

import ENUM.DurationType;
import parkingFeeCalculator.ParkingFeeCalculator;

public abstract class Vehicle {
    private String licensePlate;
    private String Vehicaltype;
    private ParkingFeeCalculator parkingFeeCalculator;

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getType() {
        return Vehicaltype;
    }

    public Vehicle(String licensePlate, String type, ParkingFeeCalculator parkingFeeCalculator) {
        this.licensePlate = licensePlate;
        this.Vehicaltype = type;
        this.parkingFeeCalculator = parkingFeeCalculator;
    }

    public double calculatefee(int duration, DurationType DurationType) {
        return parkingFeeCalculator.calculateParkingFee(Vehicaltype, duration, DurationType);
    }

    public String getVehicleType() {
        return Vehicaltype;
    }

}
