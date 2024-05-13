package visitor;

public class Individual implements Entity {
    @Override
    public void accept(InsuranceSellerInterface insuranceSeller) {
        insuranceSeller.sellToIndividual();
    }
}
