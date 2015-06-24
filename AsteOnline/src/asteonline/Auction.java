package asteonline;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.UUID;

/**
 * The class representing an Auction in the system.
 * @author gcarl
 */
public class Auction extends Observable {
    private final UUID id;
    private final LocalDateTime createdAt;
    private LocalDateTime closedAt;
    private final Item sellingItem;
    private List<Offer> offers;
    
    /**
     * Construct an auction to sell the item passed.
     * @param item the item to sell.
     */
    public Auction(Item item)
    {
        this.offers = new ArrayList<>();
        this.id = java.util.UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
        this.closedAt = LocalDateTime.now();
        this.sellingItem = item;
    }
    /**
     * Adds an offer to the autcion.
     * @param item the offer to add
     */    
    public void addOffer(Offer item) {
        this.getOffers().add(item);
    }
    
    /**
     * Closes the auction and notifies the observers of the state change.
     * @return true if the auction is closed correctly.
     */    
    public boolean close() {
        this.closedAt = LocalDateTime.now();
        this.notifyObservers(id);
        this.setChanged();
        
        return true;
    }
    
    /**
     * Checks if the auction is closed.
     * @return true if the auction is closed.
     */
    public boolean isClosed() {
        return LocalDateTime.now().isBefore(getClosedAt());
    }
    
    /**
     * Returns the unique ID of the auction.
     * @return the UUID of the auction.
     */
    public UUID getId() {
        return id;
    }
    
    /**
     * Returns the date and time when the auctions is created.
     * @return LocalDateTime 
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    /**
     * Returns the date and time when the auctions is created.
     * @return LocalDateTime 
     */
    public LocalDateTime getClosedAt() {
        return closedAt;
    }
    
    /**
     * Returns the item which is being selled in the auction
     * @return Item selled
     */
    public Item getSellingItem() {
        return sellingItem;
    }
    
    /**
     * Return the list of the offers made
     * @return List of Offer
     */
    public List<Offer> getOffers() {
        return offers;
    }
}

