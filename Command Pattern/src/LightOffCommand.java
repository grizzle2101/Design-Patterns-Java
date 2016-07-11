public class LightOffCommand  implements ICommand
{
    Light light;
    public  LightOffCommand(Light l)
    {
        light = l;
    }
    public void Execute()
    {
        light.TurnOff();
    }
    public void Undo()
    {
        light.TurnOn();
    }
}
