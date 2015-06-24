package asteonline;

/**
 * Item that can be selled or used to make an offer in the bidding system.
 * @author gcarl
 */
public class Item {
    private final String offerName;
    private final String offerDesc;
    private final Category offerCat;
    
    /**
     * Initialize an item with the parameters passed.
     * @param name Name of the item.
     * @param desc Extended description of the item
     * @param cat Category of the item. Uses an enumeration.
     */
    public Item(String name, String desc, Category cat)
    {
        this.offerName = name;
        this.offerDesc = desc;
        this.offerCat = cat;
    }
    
    /**
     * Returns the name of the ite
     * @return name of the item
     */
    public String getName() {
        return this.offerName;
    }

    /**
     * Returns the offer of the item
     * @return offer of the item
     */
    public String getOfferDesc() {
        return offerDesc;
    }
    
    /**
     * Return the category of the item
     * @return category of the item
     */
    public Category getOfferCat() {
        return offerCat;
    }
}
