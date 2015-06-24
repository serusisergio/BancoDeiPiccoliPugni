/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author gcarl
 */
public class AuctionManager {
    private static AuctionManager instance = null;   
    private static final Object sync = new Object();
    private List<Auction> auctions;
    
    public static AuctionManager getInstance(){
        synchronized(sync) {
            if(instance == null) instance = new AuctionManager();
        }
        return instance;
    }
    
    public AuctionManager() {
        this.auctions = new ArrayList<>();
    }
    
    public void add(Auction a) {
        this.auctions.add(a);
    }
    
    public List<Auction> find(UUID id) {
        // find auction
        // return results
        return null;
    }
    
    public void remove(UUID id) {
        //find auction
        // remove from auctions
    }
    
    public void makeOffer(UUID dest, Offer o) {
        //find auction
        // add offer
    }
}
