/**
 * Created by conor.mcgrath on 06/05/2016.
 */
public class Launcher
{
    public static void main (String [] args)
    {
        Thread t = new Thread();
        t.start();
    }


    public static void GetBoiling()
    {
        SingletonBoiler.getUniqueInstance().Fill();
        SingletonBoiler.getUniqueInstance().Boil();
        SingletonBoiler.getUniqueInstance().Drain();
    }
}
