package asteonline;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Class in charge to manage and save the auctions.
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
    
    /**
     * Returns the number of the auctions saved.
     * @return int - number of the auctions
     */
    public int auctionsCount() {
        return this.auctions.size();
    }
    
    /**
     * Adds an auction in the auction list
     * @param a Auction the auction to add
     * @return boolean - true if the add is success
     */
    public boolean add(Auction a) {
        if(a == null)
            throw new IllegalArgumentException();
        
        boolean result = this.auctions.add(a);
        return result;
    }
    /**
     * Returns the auction corresponding to the UUID passed
     * @param id UUID the identifier of the auction
     * @return Auction
     */
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
    /**
     * Removes the auction corresponding to the UUID passed.
     * @param id The UUID of the auction to remove.
     * @return boolean true if the remove is succes.
     */
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
    /**
     * Makes an offer in the auction corresponding to the UUID passed.
     * @param dest The UUID of the auction
     * @param o The offer to add
     * @return boolean - true if is success
     * 
     */
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
