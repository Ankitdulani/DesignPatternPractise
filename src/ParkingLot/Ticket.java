package ParkingLot;

import java.util.Date;

public class Ticket {
    Vehicle vehicle;
    String ticketNumber;
    Date entryTime;
    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle,ParkingSpot parkingSpot){
        this.vehicle = vehicle;
        this.entryTime = new Date();
        this.parkingSpot = parkingSpot;
    }

    public double calculatePrice() {
        return 0.01*((new Date()).getTime() - entryTime.getTime());
    }
}
