package mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zerodha {



    Map<Integer,List<Asker>> askerBid = new HashMap<>();
    Map<Integer, List<Bidder>> bidderBid = new HashMap<>();



    public void inform(Asker asker, ShareBid shareBid) {
       List<Asker> askers = askerBid.get(shareBid.price);
       if(askers == null) {
           askers = new ArrayList<>();
       }
       askers.add(asker);
       settle();
    }

    public void inform(Bidder bidder, ShareBid reliance) {
        List<Bidder> bidders = bidderBid.get(reliance.price);
        if(bidders == null) {
            bidders = new ArrayList<>();
        }
        bidders.add(bidder);
        settle();
    }

    private void settle() {
        boolean match=true;
        // settle
        if(match){
            // update the stock price of the share
            // asker share deduce // bidder
            // bidder paise, cut , asker account

        }
    }
}
