/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gcarl
 */
public class AsteOnlineTest {
    private UUID mockId = null;
    
    public AsteOnlineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        UserManager.getInstance().login();
        Item i = new Item("Test product", "Description", Category.Electronics);
        
        Auction a = new Auction(i);
        mockId = a.getId();
        
        Offer o = new Offer((float) 100.00, UserManager.getInstance().getSignedInUser());
        a.addOffer(o);
        
        AuctionManager.getInstance().add(a);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class AsteOnline.
     */
    @Test
    public void testLogin() {
        Assert.assertNotNull(UserManager.getInstance().getSignedInUser());
    }
    
    @Test
    public void testLogout() {
        UserManager.getInstance().logout();
        Assert.assertNull(UserManager.getInstance().getSignedInUser());
    }
    
    @Test
    public void testPay() {
        User currentUser = UserManager.getInstance().getSignedInUser();
        if(currentUser == null)
            fail();
        
        Auction first = AuctionManager.getInstance().find(mockId);
        Offer winningOffer = first.getOffers().get(0);
        boolean result = TransactionManager.getInstance().pay(first, winningOffer);
        Assert.assertTrue(result);
    }
    
    @Test
    public void testMakeOffer() {
        Offer o = new Offer((float) 100.00, UserManager.getInstance().getSignedInUser());
        boolean res = AuctionManager.getInstance().makeOffer(mockId, o);
        Assert.assertTrue(res);
    }
    
    @Test
    public void testAuctionManager() {
        UUID auctionId;
        Item i = new Item("Test product #2", "Description #2", Category.Sports);
        Auction a = new Auction(i);
        auctionId = a.getId();
        
        boolean res;
        res = AuctionManager.getInstance().add(a);
        Assert.assertTrue(res);
        Assert.assertTrue(AuctionManager.getInstance().auctionsCount() > 0);
        
        Auction finded = AuctionManager.getInstance().find(auctionId);
        Assert.assertNotNull(finded);
        
        boolean res2;
        res = AuctionManager.getInstance().remove(mockId);
        res2 = AuctionManager.getInstance().remove(auctionId);
        Assert.assertTrue(res && res2);
        
        Assert.assertTrue(AuctionManager.getInstance().auctionsCount() == 0);
    }
}
