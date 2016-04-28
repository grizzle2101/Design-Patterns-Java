/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public class Mallard extends Duck
{
    public Mallard()
    {
        flybehavior = new FlyWithWings();
        quackbehavior = new LoudQuack();
    }
    public void Display()
    {
        System.out.println("I am a Mallard Duck.");
    }
}
