/**
 * Created by conor.mcgrath on 11/07/2016.
 */
public class MacroCommand implements ICommand
{
    protected ICommand[] Commands;
    public MacroCommand(ICommand[] commands)
    {
        Commands = commands;
    }
    public void Execute()
    {
        for(int i=0; i < Commands.length; i++)
        {
            Commands[i].Execute();
        }
    }
    public void Undo()
    {
        for(int i=0; i < Commands.length; i++)
        {
            Commands[i].Undo();
        }
    }
}
