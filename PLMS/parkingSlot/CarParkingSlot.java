
package parkingSlot;

import vehicle.Vehicle;

public class CarParkingSlot extends ParkingSlot {

    public CarParkingSlot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Car".equalsIgnoreCase(vehicle.getVehicleType());
    }

    
}