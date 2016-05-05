/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public abstract class Pizza
{
    protected String name, dough, sauce;

    public void prepare()
    {
        System.out.println("Preparing " + name);
    }
    public String getName()
    {
        return name;
    }
}
