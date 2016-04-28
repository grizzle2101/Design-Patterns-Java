/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public class DecoyDuck extends Duck
{
    public DecoyDuck()
    {
        flybehavior = new FlyNoWay();
        quackbehavior = new MuteQuack();
    }
    public void Display()
    {
        System.out.println("I am Decoy Duck");
    }
}
