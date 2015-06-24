/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author simone
 */
public class Transaction {

    private User user;
    private Auction auction;
    private LocalDateTime date;
    private Offer offer;

    public Transaction(User user, Auction auction, Offer offer) {
        this.auction = auction;
        this.date = LocalDateTime.now();
        this.user = user;
        this.offer=offer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transaction other = (Transaction) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.auction, other.auction)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public LocalDateTime getDate() {
        return date;
    }



    /**
     * @return the offer
     */
    public Offer getOffer() {
        return offer;
    }

   
}
