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
     * @param owner the user making an offer
     */
    public Offer(float amount, User owner)
    {
        this.money = amount;
        this.offerOwner = owner;
        this.items = new ArrayList<>();
    }
    
    /**
     * Adds a single item to the offer
     * @param item the item to add
     */
    public void addItem(Item item){
        this.items.add(item);
    }
    
    /**
     * Adds a list of items to the offer
     * @param list the list of items to add
     */
    public void addItem(List<Item> list){
        this.items.addAll(list);
    }
    
    /**
     * Returns the amount of money being offered
     * @return the amout of money
     */
    public float getMoney() {
        return money;
    }
    
    /**
     * Return the list of items being offered
     * @return the list of items
     */
    public List<Item> getItems() {
        return items;
    }
    
    /**
     * Returns the owner of the offer
     * @return the owner of the offer
     */
    public User getOfferOwner() {
        return offerOwner;
    }
}
