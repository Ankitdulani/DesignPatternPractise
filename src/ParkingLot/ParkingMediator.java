package ParkingLot;

import java.util.List;

public class ParkingMediator {

    List<ParkingArea> parkingAreas;


    public ParkingSpot park(Vehicle vehicle,String type) {
        ParkingArea parkingArea = parkingAreas.stream().filter( area -> area.checkAvailability(type)).findFirst().orElse(null);
        if(parkingArea == null) {return null;}
        ParkingSpot spot = parkingArea.park(type,vehicle);
        return spot;
    }

    public void vacant(ParkingSpot parkingSpot) {


    }
}
