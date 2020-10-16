package restaurant;
import java.util.*; 

public class OrderNotFilledException extends Exception
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    HashMap<String, Integer> remainingOrderItems;
    HashMap<String, Integer> remainingInventoryItems;

    public OrderNotFilledException(HashMap<String , Integer> remainingOrderItems, HashMap<String , Integer> remainingInventoryItems) 
    { 
        this.remainingOrderItems = remainingOrderItems;
        this.remainingInventoryItems = remainingInventoryItems;
    } 

    public HashMap<String, Integer> getRemainingOrderItems() 
    {
        return this.remainingOrderItems;
    }
    
    public HashMap<String, Integer> getRemainingInventoryItems() 
    {
        return this.remainingInventoryItems;
    }


}
