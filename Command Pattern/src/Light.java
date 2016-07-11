/**
 * Created by conor.mcgrath on 11/07/2016.
 */
public class Light
{
    protected String Location;
    public Light(String location)
    {
        Location = location;
    }
    public void TurnOn()
    {
        System.out.println(Location + " Light is on.");
    }
    public void TurnOff()
    {
        System.out.println(Location + " Light if Off.");
    }
}
