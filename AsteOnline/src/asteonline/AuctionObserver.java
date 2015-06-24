package asteonline;

import java.util.Observable;
import java.util.Observer;
import java.util.UUID;

/**
 * Observer used to notify the users of the state change of the auctions in which they bidded.
 * @author gcarl
 */
public class AuctionObserver implements Observer {
    
    /**
     * updates the observers in the list
     * @param o the object that triggered the update
     * @param arg the UUID of the auction that changed state
     */
    @Override
    public void update(Observable o, Object arg) {
        UUID param = (UUID)arg;
        if(param != null) {
            Auction closedAuction = AuctionManager.getInstance().find(param);
            if(closedAuction != null){
                for(Offer a : closedAuction.getOffers()){
                    String message = String.format("L'utente %s ha ricevuto la notifica di chiusura dell'asta %s", 
                                                    a.getOfferOwner().getUsername(), closedAuction.getId().toString());
                    System.out.println(message);
                }
            }
        }
    }
    
}
