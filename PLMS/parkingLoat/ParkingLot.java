package parkingLoat;

import parkingSlot.ParkingSlot;
import vehicle.Vehicle;

import java.util.List;

public class ParkingLot {
    private List<ParkingSlot> parkingslots;

    public ParkingLot(List<ParkingSlot> parkingslots) {
        this.parkingslots = parkingslots;
    }

    public ParkingSlot findAvailableSpot(String vehicalType) {
        for (ParkingSlot parkingSlot : parkingslots) {
            if (!parkingSlot.isOccupied() && parkingSlot.getSpotType().equals(vehicalType)) {
                return parkingSlot;
            }
        }
        return null;
    }

    public ParkingSlot parkvehical(Vehicle vehicle) {
        ParkingSlot parkingSlot = findAvailableSpot(vehicle.getVehicleType());

        if (parkingSlot != null) {
            parkingSlot.ParkVehicle(vehicle);
            System.out.println(
                    "Vehicle parked successfully in spot: " + parkingSlot.getSpotNumber());
            return parkingSlot;
        }

        System.out.println(
                "No parking spots available for " + vehicle.getVehicleType() + "!");
        return null;
    }

    public void vacateSlot(ParkingSlot parkingSlot, Vehicle vehicle) {
        if (parkingSlot != null && parkingSlot.isOccupied()
                && parkingSlot.getVehical().equals(vehicle)) {
            parkingSlot.vacate();
            System.out.println(vehicle.getVehicleType()
                    + " vacated the spot: " + parkingSlot.getSpotNumber());
        } else {
            System.out.println("Invalid operation! Either the spot is already vacant "
                    + "or the vehicle does not match.");
        }
    }

    public ParkingSlot getSlotByNumber(int slotNumber) {
        for (ParkingSlot spot : parkingslots) {
            if (spot.getSpotNumber() == slotNumber) {
                return spot;
            }
        }
        return null;
    }


    public List<ParkingSlot> getParkingslots() {
        return parkingslots;
    }
}