package restaurant;
import java.util.*; 

public class CateringCustomer implements Customer {

    @Override
    public void purchase(Restaurant restaurant) {
        while(true)
        {
            HashMap<String, Integer> purchase = new HashMap<String, Integer>();
            try 
            {
                String[] rolls = {"Spring Roll", "Egg Roll", "Sausage Roll", "Pastry Roll", "Jelly Roll"};
                int rnd = new Random().nextInt(rolls.length);
                int rnd2 = new Random().nextInt(rolls.length);
                int rnd3 = new Random().nextInt(rolls.length);
                
                String roll1 = rolls[rnd];
                String roll2 = rolls[rnd2];
                String roll3 = rolls[rnd3];
                purchase.put(roll1, 5);
                purchase.put(roll2, 5);
                purchase.put(roll3, 5);
                System.out.println("Catering Customer: ");
                System.out.println("Original Purchase: " + purchase);
                restaurant.requestPurchase(purchase); 
                break;
            } catch(OrderNotFilledException ex)
            {
                HashMap<String, Integer> remainingInventoryItems = ex.getRemainingInventoryItems();
                HashMap<String, Integer> newOrder = new HashMap<String, Integer>();
                int rollsNeeded = 0;

                Iterator<Map.Entry<String, Integer>> it = remainingInventoryItems.entrySet().iterator();
                while (it.hasNext()) 
                {
                    Map.Entry<String, Integer> pair = it.next();
                    newOrder.put(pair.getKey(), purchase.get(pair.getKey()));
                    rollsNeeded += pair.getValue();
                }

                Iterator<Map.Entry<String, Integer>> it2 = remainingInventoryItems.entrySet().iterator();
                while (it2.hasNext() && rollsNeeded > 0) 
                {
                    Map.Entry<String, Integer> pair = it2.next();
                    if(pair.getValue() > 0) 
                    {
                        if(pair.getValue() - rollsNeeded >= 0 )
                        {
                            newOrder.put(pair.getKey(), rollsNeeded);
                            rollsNeeded --;
                            break;
                        } 
                        else 
                        {
                            newOrder.put(pair.getKey(), pair.getValue());
                            rollsNeeded -= pair.getValue();
                            break;
                        }
                    }
                }

                if(rollsNeeded > 0)
                {
                    //This isnt working right 
                    System.out.println("NOT ENOUGH INVENTORY TO FILL CATERING ORDER");
                    break;
                }
                purchase = newOrder;
            }
        }

    }
    
}
