/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public class AstronautDuck extends Duck
{
    public AstronautDuck()
    {
        flybehavior = new RocketPowered();
        quackbehavior = new BurpQuack();
    }
    public void Display()
    {
        System.out.println("I am Astronaut Duck");
    }
}
