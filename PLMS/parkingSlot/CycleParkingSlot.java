package parkingSlot;

import vehicle.Vehicle;

public class CycleParkingSlot extends ParkingSlot {

    public CycleParkingSlot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Cycle".equalsIgnoreCase(vehicle.getVehicleType());
    }

}
