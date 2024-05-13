package ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class UnderGroundParkingArea implements ParkingArea {

    Map<String, Queue<ParkingSpot>> available = new HashMap<>();
    Map<Vehicle, ParkingSpot> unavailable = new HashMap<>();

    @Override
    public boolean checkAvailability(String type) {
        Queue<ParkingSpot> parkingSpots = available.get(type);
        if (parkingSpots == null) {
            return false;
        }
        if (parkingSpots.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void park(String type, Vehicle vehicle) {
//        if (checkAvailability(type)) {
//            ParkingSpot parkingSpots = available.get(type).remove();
//            parkingSpots.park(vehicle);
//        }
    }

    @Override
    public void vacate(Vehicle vehicle) {
        ParkingSpot parkingSpot = unavailable.get(vehicle);
//        parkingSpot.vacate(vehicle);
    }

    @Override
    public String getLocation() {
        return "Under Ground Parking Area First Floor";
    }
}
