package inventory;
import java.util.*; 

public class Inventory
{
    ArrayList<Product> inv = new ArrayList<Product>();
    double totalValue = 0;

    public Inventory()
    {
        //
    }

    public void addProduct(Product p)
    {
        inv.add(p);
        totalValue += p.getQuantity()*p.getPrice();
    }

    public double getTotalValue()
    {
        return totalValue;
    }

    public double sumUp()
    {
        double temp_val = 0;
        for(Product p: inv)
        {
            temp_val += p.getQuantity()*p.getPrice();
        }
        return temp_val;
    }
}