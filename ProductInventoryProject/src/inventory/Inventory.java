package inventory;
import java.util.*; 
import java.util.HashMap;

public class Inventory
{
    private HashMap<String, Product> inv = new HashMap<String, Product>();
    private double totalValue = 0;

    public boolean addProduct(Product newP)
    {   
        if(inv.containsKey(newP.getId()))
        {
            return false;
        }
        
        inv.put(newP.getId(),newP);
        return true;
    }

    public double getTotalValue()
    {
        double temp_val = 0;
        for (Product p : inv.values()) 
        {
            temp_val += p.getQuantity()*p.getPrice();
        }

        return temp_val;
    }
    public boolean removeById(String id)
    {
        if (inv.remove(id) == null)
        {
            return false;
        }
        
        return true;
    }

    public void showInventory()
    {
        System.out.println("ID  PRICE  QUANTITY");
        for (Product p: inv.values())
        {
            System.out.println(p.getId()+" "+p.getPrice()+" "+p.getQuantity());
        }
    }
}