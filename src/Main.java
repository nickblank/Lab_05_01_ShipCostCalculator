public class Main
{

    public static void main(String[] args)
    {
	    int itemPrice = 94;
        double SHIP_COST = 0.02;
        double totalCost = 0;

        if(itemPrice >= 100)
        {
            totalCost = itemPrice * SHIP_COST;
            System.out.println("Your new cost is $" + totalCost + ".");
        }
        else
        {
            System.out.println("The shipping is free, here is your total $" + itemPrice + ".");
        }
    }
}
