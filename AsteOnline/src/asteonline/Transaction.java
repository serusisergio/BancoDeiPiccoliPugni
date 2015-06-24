package asteonline;

import java.time.LocalDateTime;

/**
 * Represent the payment of an offer.
 * @author simone
 */
public class Transaction {

    private final User user;
    private final Auction auction;
    private final LocalDateTime date;
    private final Offer offer;
    
    /**
     * Creates a transaction with the passed values
     * @param user The user that makes the payment
     * @param auction The auction corresponding to the payment
     * @param offer The offer being paid
     */
    public Transaction(User user, Auction auction, Offer offer) {
        this.auction = auction;
        this.date = LocalDateTime.now();
        this.user = user;
        this.offer=offer;
    }
    
    /**
     * Returns the user that did the transaction
     * @return the user
     */
    public User getUser() {
        return user;
    }
    
    /**
     * Returns the auction corresponding to the payment
     * @return the auction
     */
    public Auction getAuction() {
        return auction;
    }
    
    /**
     * Returns the date and time when the transaction is done
     * @return date and time
     */
    public LocalDateTime getDate() {
        return date;
    }
    
    /**
     * Returns the offer being paid
     * @return the offer
     */
    public Offer getOffer() {
        return offer;
    }
}
