package snackBarApp;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingID;

    public Snack(String name, int quantity, double cost, int vendingID)
    {
        maxId++;
        this.id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingID = vendingID;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    public void buySnack(int amount)
    {
        this.quantity -= amount;
    }

    public double getTotal(int amount)
    {
        return this.cost * amount;
    }
}