package parkingFeeCalculator;

import ENUM.DurationType;

public interface ParkingFeeCalculator {
    
    double calculateParkingFee(String VehicalType,int duration,DurationType durationtype);
}
