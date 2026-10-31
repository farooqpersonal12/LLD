package parkingSlot;

import vehicle.Vehicle;

public class BikeParkingSlot extends ParkingSlot{

    public BikeParkingSlot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Bike".equalsIgnoreCase(vehicle.getVehicleType());
    }
    
}
