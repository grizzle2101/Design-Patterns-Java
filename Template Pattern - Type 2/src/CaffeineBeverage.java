/**
 * Created by conor.mcgrath on 13/07/2016.
 */
public abstract class CaffeineBeverage
{
    public  void PrepareReceipe()
    {
        BoilWater();
        Brew();
        PourIntoCup();
        AddCondiments();
    }
    public  void BoilWater()
    {
        System.out.println("Boiling Water");
    }
    public abstract void Brew();
    public void PourIntoCup()
    {
        System.out.println("Pouring into Cup");
    }
    public abstract void AddCondiments();
}
