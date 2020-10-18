package restaurant;

public class Cashier extends Observer {
    
    public Cashier(Restaurant restaurant)
    {
        this.restaurant = restaurant;
        this.restaurant.attach(this);
    }

    @Override
    public void update()
    {
        System.out.println("In Cashier");
    }

}
