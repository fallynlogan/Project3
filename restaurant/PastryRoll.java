package restaurant;

public class PastryRoll implements FoodItem {

    @Override
    public String getDescription()
    {
        return "Pastry Roll";
    }

    @Override
    public double cost()
    {
        return 2.75;
    }
    
}
