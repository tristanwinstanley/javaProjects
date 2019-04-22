package inventory;
import java.util.*; 

public class Inventory
{
    private ArrayList<Product> inv = new ArrayList<Product>();
    private double totalValue = 0;

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

    public void showInventory()
    {
        for(Product p: inv)
        {
            System.out.println("ID  PRICE  QUANTITY");
            System.out.println(p.getId()+" "+p.getQuantity()+" "+p.getPrice());
        }
    }
}