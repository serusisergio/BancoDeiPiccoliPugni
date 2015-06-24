/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.UUID;

/**
 *
 * @author gcarl
 */
public class Auction extends Observable {
    private final UUID id;
    private final LocalDateTime createdAt;
    private final LocalDateTime closedAt;
    private final OfferItem sellingItem;
    private List<Offer> offers;
    
    public Auction(OfferItem item)
    {
        this.offers = new ArrayList<>();
        this.id = java.util.UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
        this.closedAt = LocalDateTime.now();
        this.sellingItem = item;
    }
    
    public void addOffer(Offer item) {
        this.getOffers().add(item);
    }
    
    public Boolean isClosed() {
        return LocalDateTime.now().isBefore(getClosedAt());
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public OfferItem getSellingItem() {
        return sellingItem;
    }

    public List<Offer> getOffers() {
        return offers;
    }
}

