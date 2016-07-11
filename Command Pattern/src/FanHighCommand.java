/**
 * Created by conor.mcgrath on 11/07/2016.
 */
public class FanHighCommand implements ICommand
{
    CeilingFan Fan;
    int prevSpeed;

    public FanHighCommand(CeilingFan fan)
    {
        Fan = fan;
    }
    public void Execute()
    {
        prevSpeed = Fan.getSpeed();
        Fan.FanHigh();
    }
    public void Undo()
    {
        if(prevSpeed == 3)
        {
            Fan.FanHigh();
        }
        else if(prevSpeed == 2)
        {
            Fan.FanMedium();
        }
        else if(prevSpeed == 1)
        {
            Fan.FanLow();
        }
        else if(prevSpeed == 0)
        {
            Fan.FanOff();
        }
    }
}
