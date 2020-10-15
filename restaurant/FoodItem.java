package restaurant;

public interface FoodItem {
    String description = "Unknown FoodItem";
    public String getDescription();
    public abstract double cost();
}
