package restaurant;

public class SausageRoll implements FoodItem {

    @Override
    public String getDescription()
    {
        return "Sausage Roll";
    }

    @Override
    public double cost()
    {
        return 4.00;
    }
}
