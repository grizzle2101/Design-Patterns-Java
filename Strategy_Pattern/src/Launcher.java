import java.awt.*;

/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public class Launcher
{
    public static void main(String [] args)
    {
        System.out.println("Strategy Pattern:");
        //Mallard Duck
        Mallard mDuck = new Mallard();
        mDuck.Display();
        mDuck.PerformFly();
        mDuck.PerformQuack();

        //Changing Behavior @ Runtime
        mDuck.SetFlyBehavior(new RocketPowered());
        mDuck.PerformFly();

        //Decoy Duck
        DecoyDuck dDuck = new DecoyDuck();
        dDuck.Display();
        dDuck.PerformFly();
        dDuck.PerformQuack();

        //Astronaut Duck
        AstronautDuck aDuck = new AstronautDuck();
        aDuck.Display();
        aDuck.PerformFly();
        aDuck.PerformQuack();



    }
}
