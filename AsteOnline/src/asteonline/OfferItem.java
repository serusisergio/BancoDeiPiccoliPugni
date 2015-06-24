/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

/**
 *
 * @author gcarl
 */
public class OfferItem {
    private final String offerName;
    private final String offerDesc;
    private final String offerCat;
    
    public OfferItem(String name, String desc, String cat)
    {
        this.offerName = name;
        this.offerDesc = desc;
        this.offerCat = cat;
    }
    
    public String getName() {
        return this.offerName;
    }

    public String getOfferDesc() {
        return offerDesc;
    }

    public String getOfferCat() {
        return offerCat;
    }
}
