/**
 * Created by conor.mcgrath on 11/07/2016.
 */
public class LightOnCommand implements ICommand
{
    Light light;
    public  LightOnCommand(Light l)
    {
        light = l;
    }
    public void Execute()
    {
        light.TurnOn();
    }
    public void Undo()
    {
        light.TurnOff();
    }
}

