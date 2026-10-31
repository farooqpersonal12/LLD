package parkingFeeCalculator;

import ENUM.DurationType;

public class BasicFee implements ParkingFeeCalculator {

    @Override
    public double calculateParkingFee(String VehicalType, int duration, DurationType durationtype) {
        double fee = 0.0;
        switch (VehicalType.toLowerCase()) {
            case "car":
                if (durationtype == DurationType.HOURS) {
                    fee = duration * 20.0;
                } else {
                    fee = duration * 20.0 * 24;
                }
                break;

            case "bike":
                if (durationtype == DurationType.HOURS) {
                    fee = duration * 10.0;
                } else {
                    fee = duration * 10.0 * 24;
                }
                break;

            case "cycle":
                if (durationtype == DurationType.HOURS) {
                    fee = duration * 8.0;
                } else {
                    fee = duration * 8.0 * 24;
                }
                break;

            default:
                if (durationtype == DurationType.HOURS) {
                    fee = duration * 25.0;
                } else {
                    fee = duration * 25.0 * 24;
                }
                break;
        }
        return fee;
    }

}
