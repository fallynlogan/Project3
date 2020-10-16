package restaurant;
import java.util.*; 

//OO Factory Pattern applied
public class CustomerFactory {

    public static HashMap<String, ArrayList<Customer>> getCustomers()
    {   ArrayList<Customer> casualCustomer = new ArrayList<Customer>();
        ArrayList<Customer> businessCustomer = new ArrayList<Customer>();
        ArrayList<Customer> cateringCustomer = new ArrayList<Customer>();

        HashMap<String, ArrayList<Customer>> totalCustomers = new HashMap<String, ArrayList<Customer>>();
        //1-12 casual customers
        int rndCasual = new Random().nextInt(12) + 1;
        //1-3 business customers 
        int rndBusiness = new Random().nextInt(3) + 1;
        //1-3 catering customers 
        int rndCatering = new Random().nextInt(3) + 1;
        
        //map of how many of each type of customer
        for(int i =0; i < rndCasual; i++)
        {
            casualCustomer.add(new CasualCustomer());
        }

        for(int i =0; i < rndBusiness; i++)
        {
            businessCustomer.add(new BusinessCustomer());
        }

        for(int i =0; i < rndCatering; i++)
        {
            cateringCustomer.add(new CateringCustomer());
        }

        totalCustomers.put("Casual Customers", casualCustomer);
        totalCustomers.put("Business Customers", businessCustomer);
        totalCustomers.put("Catering Customers", cateringCustomer);
        
        return totalCustomers;   
    }
}
