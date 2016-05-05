/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public class Launcher
{
    public static void main (String [] args)
    {
        System.out.println("Simple Factory Pattern");

        PizzaStore storeOne = new PizzaStore(new PizzaFactory());
        storeOne.orderPizza("cheese");
    }
}
