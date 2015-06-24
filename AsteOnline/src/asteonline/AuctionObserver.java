/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

import java.util.Observable;
import java.util.Observer;
import java.util.UUID;

/**
 *
 * @author gcarl
 */
public class AuctionObserver implements Observer {

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
