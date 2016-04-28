/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public abstract class Duck
{
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;

    //Set & Perform FlyBehavior
    public void SetFlyBehavior(FlyBehavior fb)
    {
        flybehavior = fb;
    }
    public void PerformFly()
    {
        flybehavior.fly();
    }
    //Set & Perform QuackBehvaior
    public void SetQuackBehavior(QuackBehavior qb)
    {
        quackbehavior = qb;
    }
    public void PerformQuack()
    {
        quackbehavior.quack();
    }
    //To Be Implemented By Subclasses
    public abstract void Display();

    //Familiar with All Subclasses
    public void Swim()
    {
        System.out.print("All Ducks Swim");
    }
}
