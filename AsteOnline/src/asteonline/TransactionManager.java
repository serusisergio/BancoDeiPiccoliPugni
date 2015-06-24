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
    public boolean Pay(Auction a, Offer o) {
        if(a== null || o==null) throw new IllegalArgumentException();
        Transaction t= new Transaction(null, a, o);
        boolean res= false;
        res=this.transaction.add(t);
        return res;
        
    }
}
