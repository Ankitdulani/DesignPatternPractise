package visitor;

public class Farmer implements Entity {
    @Override
    public void accept(InsuranceSellerInterface insuranceSeller) {
        insuranceSeller.sellToFarmer();
    }
}
