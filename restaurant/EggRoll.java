package restaurant;

public class EggRoll implements FoodItem {
    @Override
    public String getDescription()
    {
        return "Egg Roll";
    }

    @Override
    public double cost()
    {
        return 3.75;
    }
    
}
