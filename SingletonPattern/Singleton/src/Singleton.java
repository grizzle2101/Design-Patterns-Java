/**
 * Created by conor.mcgrath on 06/05/2016.
 */
public class Singleton
{
    private static Singleton uniqueInstance;

    private Singleton()
    {

    }
    public static Singleton getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    public void Test()
    {
        System.out.println("Test");
    }
}
