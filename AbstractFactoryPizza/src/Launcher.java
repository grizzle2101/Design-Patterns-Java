/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public class Launcher
{
    public static void main (String [] args)
    {
        System.out.println("Abstract Factory Pattern:");

        //Store One
        NYPizzaStore storeOne = new NYPizzaStore();

        //Order One
        Pizza orderOne = storeOne.orderPizza("pepperoni");

        //Store Two
        CaliPizzaStore storeTwo = new CaliPizzaStore();

        //Order Two
        Pizza orderTwo = storeTwo.orderPizza("pepperoni");
    }
}
