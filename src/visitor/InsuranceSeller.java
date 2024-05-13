package visitor;

import java.util.List;

public class InsuranceSeller implements InsuranceSellerInterface {


    public void sell(List<Entity> prospectiveClients){
        prospectiveClients.stream().forEach(entity -> entity.accept(this));
    }

    @Override
    public void sellToBank() {
        System.out.println("Buy our Credit Default swap, I will give 5 discount");
    }

    @Override

    public void sellToCorporate() {
        System.out.println("Buy our Fire Insurance");
    }

    @Override
    public void sellToIndividual() {
        System.out.println("Buy our Term insurance");

    }

    @Override
    public void sellToFarmer() {
        System.out.println("Buy our Crop Insurance");
    }
}
