package restaurant;
import java.util.*; 

public class BusinessCustomer implements Customer {

    @Override
    public void purchase(Restaurant restaurant) {
        while(true)
        {
            try 
            {
                HashMap<String, Integer> purchase = new HashMap<String, Integer>();
                purchase.put("Spring Roll", 2);
                purchase.put("Egg Roll", 2);
                purchase.put("Sausage Roll", 2);
                purchase.put("Pastry Roll", 2);
                purchase.put("Jelly Roll", 2);
                System.out.println("Business Customer: ");
                System.out.println("Original Purchase: " + purchase);
                restaurant.requestPurchase(purchase);
                break;
            } catch(OrderNotFilledException ex)
            {
                //System.out.println(Arrays.asList(ex.getRemainingOrderItems()));
                //System.out.println(Arrays.asList(ex.getRemainingInventoryItems()));
                System.out.println("NOT ENOUGH INVENTORY TO FILL BUSINESS ORDER");
                return;
            }
            
        }

    }
}
