package inventory;
import java.util.*; 

public class Inventory
{
    private ArrayList<Product> inv = new ArrayList<Product>();
    private double totalValue = 0;

    public boolean addProduct(Product newP)
    {   
        for(Product p: inv)
        {
            if (p.getId().equals(newP.getId()))
            {
                return false;
            }   
        }
        inv.add(newP);
        return true;
    }

    public double getTotalValue()
    {
        double temp_val = 0;
        for(Product p: inv)
        {
            temp_val += p.getQuantity()*p.getPrice();
        }
        return temp_val;
    }
    public boolean removeById(String id)
    {
        boolean validId = false;
        int i = 0;
        for(Product p: inv)
        {
            if(p.getId().equals(id))
            {
                inv.remove(i);
                validId = true;
                break;
            }
            i++;
        }
        return validId;
    }

    public void showInventory()
    {
        System.out.println("ID  PRICE  QUANTITY");
        for(Product p: inv)
        {
            System.out.println(p.getId()+" "+p.getQuantity()+" "+p.getPrice());
        }
    }
}