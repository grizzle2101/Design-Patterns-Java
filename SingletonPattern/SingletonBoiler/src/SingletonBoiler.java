/**
 * Created by conor.mcgrath on 06/05/2016.
 */
public class SingletonBoiler
{
    private volatile static boolean empty, boiled;
    private static SingletonBoiler uniqueInstance;


    private SingletonBoiler()
    {
        empty = true;
        boiled = false;
    }
    //Thread-Safe Lock
    public synchronized static SingletonBoiler getUniqueInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new SingletonBoiler();
        }
        return uniqueInstance;
    }
    public void Fill()
    {
        if(empty == true && boiled == false)
        {
            System.out.println("Filling Tank...");
            empty = false;
        }
    }
    public void Boil()
    {
        if(empty == false && boiled == false)
        {
            System.out.println("Boiling Mixture...");
            boiled = true;
        }
    }
    public void Drain()
    {
        if(empty == false && boiled == true)
        {
            System.out.println("Draining Tank...");
            empty = true;
        }
    }
}
