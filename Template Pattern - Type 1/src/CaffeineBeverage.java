/**
 * Created by conor.mcgrath on 13/07/2016.
 */
public abstract class CaffeineBeverage
{
    public abstract   void PrepareReceipe();
    public  void BoilWater()
    {
        System.out.println("Boiling Water");
    }
    public void PourIntoCup()
    {
        System.out.println("Pouring into Cup");
    }
}
