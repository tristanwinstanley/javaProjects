package inventory;
public class InventoryDriver
{
    public static void main(String[] args)
    {
        boolean running = true;
        Inventory inventory = new Inventory();
        Product hammers = new Product(10, 30, "Hammer");
        Product saws = new Product(3, 300, "Saws");
        inventory.addProduct(hammers);
        inventory.addProduct(saws);
        System.out.println(inventory.getTotalValue());
        System.out.println(inventory.sumUp());
        
        while(running)
        {

        }

    }

    public askChoice()
    {
        
    }
}