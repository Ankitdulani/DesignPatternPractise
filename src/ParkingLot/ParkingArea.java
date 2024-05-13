package ParkingLot;

public interface ParkingArea {
    public boolean checkAvailability(String type);
    public ParkingSpot park(String type,Vehicle vehicle);
    public void vacate(Vehicle vehicle);
    public String getLocation();
}
