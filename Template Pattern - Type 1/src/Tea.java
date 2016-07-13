/**
 * Created by conor.mcgrath on 13/07/2016.
 */
public class Tea extends CaffeineBeverage
{
    public void PrepareReceipe()
    {
        BoilWater();
        SteepTeaBag();
        PourIntoCup();
        AddLemon();
    }
    public void SteepTeaBag()
    {
        System.out.println("Steeping Tea Bag");
    }
    public void AddLemon()
    {
        System.out.println("Adding Lemon");
    }
}
