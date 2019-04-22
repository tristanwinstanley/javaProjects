package inventory;
public class Product
{
    private int price;
    private String id;
    private int quantity;

    public Product(int price, int quantity, String id)
    {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public int getPrice()
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