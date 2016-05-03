package Classes;

/**
 * Created by conor.mcgrath on 03/05/2016.
 */
public class Launcher {
    public static void main (String [] args)
    {
        System.out.println("Decorator Pattern");

        //Basic Drink
        Beverage drinkOne = new HouseBlend();
        System.out.println(drinkOne.getDescription() + " " +  drinkOne.cost());

        //Dynamic Versions
        drinkOne = new SteamedMilk(drinkOne);
        System.out.println(drinkOne.getDescription() + " " +  drinkOne.cost());

        Beverage drinkTwo = new DarkRoast();
        drinkTwo = new Mocha(drinkTwo);
        System.out.println(drinkTwo.getDescription() + " " +  drinkTwo.cost());

        Beverage drinkThree = new Decaf();
        drinkThree = new Soy(drinkThree);
        System.out.println(drinkThree.getDescription() + " " +  drinkThree.cost());

        Beverage drinkFour = new Espresso();
        drinkFour = new Whip(drinkFour);
        System.out.println(drinkFour.getDescription() + " " +  drinkFour.cost());


    }
}
