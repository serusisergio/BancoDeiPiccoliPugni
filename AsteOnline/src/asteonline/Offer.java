package asteonline;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an offer in the system. An offer is a money amount and/or a list of items.
 * @author gcarl
 */
public class Offer {
    private final float money;
    private final List<Item> items;
    private final User offerOwner;
    
    /**
     * Instantiate an offer with the parameters passed
     * @param amount the money amount to offer. 
     * @param owner 
     */
    public Offer(float amount, User owner)
    {
        this.money = amount;
        this.offerOwner = owner;
        this.items = new ArrayList<>();
    }

    public float getMoney() {
        return money;
    }

    public List<Item> getItems() {
        return items;
    }

    public User getOfferOwner() {
        return offerOwner;
    }
}
