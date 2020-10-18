package restaurant;
import java.util.*; 

public interface Customer {
    //cashier will observe all customers
    public void purchase(Restaurant restaurant);
    public int getNumOutages();
}
