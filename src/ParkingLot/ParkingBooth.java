package ParkingLot;

public class ParkingBooth {
    private ParkingMediator mediator;

    public ParkingBooth(ParkingMediator mediator) {
        this.mediator = mediator;
    }

    public void park(Vehicle vehicle,String type){
        ParkingSpot parkingSpot =  mediator.park(vehicle,type);
        Ticket ticket = new Ticket(vehicle,parkingSpot);
    }

    public void vacate(Ticket ticket,Vehicle vehicle){
        Double price  = ticket.calculatePrice();
        mediator.vacant(ticket.parkingSpot);
        //call payment

    }
}
