package restaurant;
import java.util.*; 

public class Restaurant {
    public static HashMap<String, Integer> inventory;

    public Restaurant(int numDays, int numRolls)
    {
        inventory = new HashMap<String, Integer>();
        inventory.put("numSprRolls", numRolls);
        inventory.put("numEggRolls", numRolls);
        inventory.put("numPastryRolls", numRolls);
        inventory.put("numSausageRolls", numRolls);
        inventory.put("numJellyRolls", numRolls);

        //decorator tests
        //spring roll init 3.50
        FoodItem springRoll  = new SpringRoll();
        springRoll =  new ToppingDecorator(springRoll, "Shredded Cabbage");
        System.out.println("Test1: "+ springRoll.getDescription() + " $" + springRoll.cost());
        // //should print 4.00

        FoodItem springRoll2  = new SpringRoll();
        //springRoll2 =  new FillingDecorator(springRoll2);
        System.out.println("Test2: " + springRoll2.getDescription() + " $" + springRoll2.cost());
        //should print 5.00

        FoodItem springRoll3  = new SpringRoll();
        springRoll3 =  new SauceDecorator(springRoll3);
        System.out.println("Test3: " + springRoll3.getDescription() + " $" + springRoll3.cost());
        //should be 4.50

        FoodItem springRoll4  = new SpringRoll();
        springRoll4 =  new SauceDecorator(springRoll4);
        //springRoll4 = new FillingDecorator(springRoll4);
        springRoll4 = new ToppingDecorator(springRoll4, "Shredded Cabbage");
        System.out.println("Test4: " + springRoll4.getDescription() + " $" + springRoll4.cost());
        //should be 6.00

        System.out.println("---------- Welcome to Molly's Mouthwatering Rolls! The simulation is about to begin... ----------\n\n");
        for(int i=1 ; i<=numDays ; i++)
        {
            //Day number
            System.out.println("Today is Day " + i + ".");
            //reset rolls at beggining of day if they are 0 
            if(inventory.get("numSprRolls")==0){
                inventory.put("numSprRolls", numRolls);
            }
            if(inventory.get("numEggRolls")==0){
                inventory.put("numEggRolls", numRolls);
            }
            if(inventory.get("numPastryRolls")==0){
                inventory.put("numPastryRolls", numRolls);
            }
            if(inventory.get("numSausageRolls")==0){
                inventory.put("numSausageRolls", numRolls);
            }
            if(inventory.get("numJellyRolls")==0){
                inventory.put("numJellyRolls", numRolls);
            }
            //Rolls in inventory at the start of the day by type
            System.out.println("Initial Spring Rolls: " + inventory.get("numSprRolls"));
            System.out.println("Initial Egg Rolls: " + inventory.get("numEggRolls"));
            System.out.println("Initial Pastry Rolls: " + inventory.get("numPastryRolls"));
            System.out.println("Initial Sausage Rolls: " + inventory.get("numSausageRolls"));
            System.out.println("Initial Jelly Rolls: " + inventory.get("numJellyRolls"));
            System.out.println("\n====================================================================================================\n");

            //print out the inventory at the end of each day by type
            System.out.println("\nInventory at the end of Day " + i + ".");
            System.out.println("Leftover Spring Rolls: " + inventory.get("numSprRolls"));
            System.out.println("Leftover Egg Rolls: " + inventory.get("numEggRolls"));
            System.out.println("Leftover Pastry Rolls: " + inventory.get("numPastryRolls"));
            System.out.println("Leftover Sausage Rolls: " + inventory.get("numSausageRolls"));
            System.out.println("Leftover Jelly Rolls: " + inventory.get("numJellyRolls"));
            System.out.println("\n====================================================================================================\n");

        }
    }
    
}
