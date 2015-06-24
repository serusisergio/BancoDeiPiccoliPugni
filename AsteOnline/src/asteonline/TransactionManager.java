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
 * @author simone
 */
public class TransactionManager {
    
    private static TransactionManager instance = null;   
    private static final Object sync = new Object();
    private List<Transaction> transaction;
    
    
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
     * 
     * @param a è l'asta a cui si sta partecipando
     * @param o è la lista diggetti che stiamo utilizzando per pagare
     * @return risultato
     */
    public boolean Pay(Auction a, Offer o) {
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
