/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gcarl
 */
public class Offer {
    private final float money;
    private final List<OfferItem> items;
    private final User offerOwner;
    
    public Offer(float amount, User owner)
    {
        this.money = amount;
        this.offerOwner = owner;
        this.items = new ArrayList<>();
    }

    public float getMoney() {
        return money;
    }

    public List<OfferItem> getItems() {
        return items;
    }

    public User getOfferOwner() {
        return offerOwner;
    }
}
