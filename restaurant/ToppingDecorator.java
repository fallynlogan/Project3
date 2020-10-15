package restaurant;

public class ToppingDecorator extends FoodItemDecorator {
    private String toppingName;

    public ToppingDecorator(FoodItem decoraFoodItem, String toppingName)
    {
        super(decoraFoodItem);
        this.toppingName = toppingName;
    }

    @Override
    public String getDescription()
    {
        return (decoratedFoodItem.getDescription() + " " + this.toppingName);
    }

    public double cost()
    {
       return (decoratedFoodItem.cost() + 0.50);
    }

}
