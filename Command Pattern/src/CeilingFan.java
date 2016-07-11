/**
 * Created by conor.mcgrath on 11/07/2016.
 */
public class CeilingFan
{
    String Location;
    private int speed;

    public CeilingFan(String location)
    {
        Location = location;
    }
    public void FanHigh()
    {
        speed = 3;
        System.out.println(Location + " Fan is on High.");
    }
    public void FanMedium()
    {
        speed = 2;
        System.out.println(Location + " Fan is Medium.");
    }
    public void FanLow()
    {
        speed = 1;
        System.out.println(Location + " Fan is Low.");
    }
    public void FanOff()
    {
        speed = 0;
        System.out.println(Location + " Fan is off.");
    }
    public int getSpeed()
    {
        return speed;
    }
}
