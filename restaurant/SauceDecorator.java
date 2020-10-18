package restaurant;

public class SauceDecorator extends FoodItemDecorator {
    private String sauceName;

    public SauceDecorator(FoodItem decoratedFoodItem, String sauceName)
    {
        super(decoratedFoodItem);
        this.sauceName = sauceName;
    }

    @Override
    public String getDescription()
    {
        return (decoratedFoodItem.getDescription() + " " + this.sauceName);
    }

    public double cost()
    {
       return (decoratedFoodItem.cost() + 1.00);
    }
    
}