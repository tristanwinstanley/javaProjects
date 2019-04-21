package inventory;
public class Product
{
    private double price;
    private String id;
    private int quantity;

    public Product(double price, int quantity, String id)
    {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public String getId()
    {
        return id;
    }


}