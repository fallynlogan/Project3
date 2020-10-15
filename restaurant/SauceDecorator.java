package restaurant;

public class SauceDecorator extends FoodItemDecorator {
    private String newDescription = "";

    public SauceDecorator(FoodItem decoratedFoodItem)
    {
        super(decoratedFoodItem);
    }

    @Override
    public String getDescription()
    {
        if (decoratedFoodItem.getDescription() == "Spring Roll") {
            newDescription = (" Peanut Sauce");
        }

        if (decoratedFoodItem.getDescription() == "Egg Roll") {
            newDescription = (" Sweet & Sour Sauce");
        }

        if (decoratedFoodItem.getDescription() == "Pastry Roll") {
            newDescription = (" Dark Chocolate Sauce");
        }

        if (decoratedFoodItem.getDescription() == "Sausage Roll") {
            newDescription = (" Marinara Sauce");
        }

        if (decoratedFoodItem.getDescription() == "Jelly Roll") {
            newDescription = (" Cranberry Sauce");
        }

        return (decoratedFoodItem.getDescription() + newDescription);
    }
    
    public double cost()
    {
       return (decoratedFoodItem.cost() + 1.00);
    }
}
