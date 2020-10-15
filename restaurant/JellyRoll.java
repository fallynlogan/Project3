package restaurant;

public class JellyRoll implements FoodItem {
    
    @Override
    public String getDescription()
    {
        return "Jelly Roll";
    }

    @Override
    public double cost()
    {
        return 2.50;
    }
    
}
