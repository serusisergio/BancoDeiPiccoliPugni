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
    
    private AuctionManager() {
        this.auctions = new ArrayList<>();
    }
    
    public int auctionsCount() {
        return this.auctions.size();
    }
    
    public boolean add(Auction a) {
        if(a == null)
            throw new IllegalArgumentException();
        
        boolean result = this.auctions.add(a);
        return result;
    }
    
    public Auction find(UUID id) {
        if(id == null)
            throw new IllegalArgumentException();
        
        Auction result = null;
        for (Auction auction : this.auctions) {
            if (auction.getId().equals(id)) {
                result = auction;
            }
        }
        return result;
    }
    
    public boolean remove(UUID id) {
        if(id == null)
            throw new IllegalArgumentException();
        
        Auction selectedAuction = null;
        for (Auction auction : this.auctions) {
            if (auction.getId().equals(id)) {
                selectedAuction = auction;
            }
        }
        
        boolean result = false;
        if(selectedAuction != null) {
            result = this.auctions.remove(selectedAuction);
        }
        
        return result;
    }
    
    public boolean makeOffer(UUID dest, Offer o) {
        if(dest == null || o == null)
            throw new IllegalArgumentException();
        
        int index = -1;
        for (Auction auction : this.auctions) {
            if (auction.getId().equals(dest)) {
                index = this.auctions.indexOf(auction);
            }
        }
        
        boolean res = false;
        if(index >= 0) {
            res = this.auctions.get(index).getOffers().add(o);
        }

        return res;
    }
}
