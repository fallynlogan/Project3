package restaurant;

public class FoodItemDecorator implements FoodItem {
    //OO Decorator pattern applied
    protected FoodItem decoratedFoodItem;

    public FoodItemDecorator(FoodItem decoratedFoodItem)
    {
        this.decoratedFoodItem = decoratedFoodItem;
    }

    public String getDescription()
    {
        return decoratedFoodItem.getDescription();
    }

    public double cost()
    {
        return decoratedFoodItem.cost();
    }
}
