package asteonline;

import java.time.LocalDateTime;

/**
 *
 * @author simone
 */
public class Transaction {

    private final User user;
    private final Auction auction;
    private final LocalDateTime date;
    private final Offer offer;

    public Transaction(User user, Auction auction, Offer offer) {
        this.auction = auction;
        this.date = LocalDateTime.now();
        this.user = user;
        this.offer=offer;
    }

    public User getUser() {
        return user;
    }

    public Auction getAuction() {
        return auction;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Offer getOffer() {
        return offer;
    }
}
