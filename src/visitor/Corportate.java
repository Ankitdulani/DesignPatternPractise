package visitor;

public class Corportate implements Entity {

    @Override
    public void accept(InsuranceSellerInterface insuranceSeller) {
        insuranceSeller.sellToCorporate();
    }
}
