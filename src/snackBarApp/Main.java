package snackBarApp;

public class Main
{
    public static void doWork()
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);

        Snack soda = new Snack("Soda", 24, 2.50, 2);
        Snack water = new Snack("Water", 20, 2.75, 2);

        jane.buySnack(soda.getTotal(3));
        soda.buySnack(3);
        System.out.println(jane.getCash());
        System.out.println(soda.getQuantity());

    }

    public static void main(String[] args)
    {
        doWork();
    }
}