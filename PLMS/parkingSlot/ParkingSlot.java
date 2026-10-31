package parkingSlot;

import vehicle.Vehicle;

public abstract class ParkingSlot {
    private int spotNumber;
    private Vehicle vehical;
    private boolean isOccupied;
    private String spotType;

    public ParkingSlot(int spotNumber, String spotType) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.spotType = spotType;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getVehical() {
        return vehical;
    }

    public String getSpotType() {
        return spotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void ParkVehicle(Vehicle vehicle) {
        if (isOccupied) {
            throw new IllegalStateException("Spot is already occupied");
        }

        if (!canParkVehicle(vehicle)) {
            throw new IllegalArgumentException(
                    "This slot is not sutable for " + vehicle.getType());

        }
        this.vehical = vehicle;
        this.isOccupied = true;
    }

    public void vacate() {
        if (!isOccupied) {
            throw new IllegalArgumentException("Spot is alredy vacant.");
        }

        this.vehical = null;
        this.isOccupied = false;
    }



}