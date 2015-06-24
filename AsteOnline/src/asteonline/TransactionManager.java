package asteonline;

import java.util.ArrayList;
import java.util.List;

/**
 * The class in charge to manage and memorize the transactions.
 * @author simone
 */
public class TransactionManager {
    
    private static TransactionManager instance = null;   
    private static final Object sync = new Object();
    private List<Transaction> transaction;
    
    /**
     * Return the singleton instace.
     * @return 
     */
    public static TransactionManager getInstance(){
        synchronized(sync) {
            if(instance == null) instance = new TransactionManager();
        }
        return instance;
    }
    
    private TransactionManager() {
        this.transaction = new ArrayList<>();
    }
    
    /**
     * Pays the offer in the auction passed as parameters.
     * @param a the auction
     * @param o the offer to pay
     * @return true if the payment is success
     */
    public boolean pay(Auction a, Offer o) {
        if(a== null || o==null)
            throw new IllegalArgumentException();
        
        boolean res = false;
        User u = UserManager.getInstance().getSignedInUser();
        if(u != null) {
            try
            {
                Transaction t = new Transaction(u, a, o);
                res = this.transaction.add(t);
            }
            catch(Exception e)
            {
                
            }
        }
        
        return res;
    }
}
