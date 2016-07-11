public class FanOffCommand implements ICommand
{
    CeilingFan Fan;
    int prevSpeed;

    public FanOffCommand(CeilingFan fan)
    {
        Fan = fan;
    }
    public void Execute()
    {
        prevSpeed = Fan.getSpeed();
        Fan.FanOff();
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