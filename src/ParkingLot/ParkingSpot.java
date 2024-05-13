package ParkingLot;

import java.util.Date;

public abstract class ParkingSpot {
    private String spotNumber;
    public abstract String getParkingType();
    public String getParkingSpotNumber(){
        return spotNumber;
    };
}
