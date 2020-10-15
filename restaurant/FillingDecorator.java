package restaurant;

public class FillingDecorator extends FoodItemDecorator {
    private String fillingName;

    public FillingDecorator(FoodItem decoratedFoodItem, String fillingName)
    {
        super(decoratedFoodItem);
        this.fillingName = fillingName;
    }

    @Override
    public String getDescription()
    {
        return (decoratedFoodItem.getDescription() + " " + this.fillingName);
    }

    public double cost()
    {
       return (decoratedFoodItem.cost() + 1.50);
    }
    
}
