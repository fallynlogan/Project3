package restaurant;

public class SpringRoll implements FoodItem {

    @Override
    public String getDescription()
    {
        return "Spring Roll";
    }

    @Override
    public double cost()
    {
        return 3.50;
    }
    
}
