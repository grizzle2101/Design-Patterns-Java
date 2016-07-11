/**
 * Created by conor.mcgrath on 11/07/2016.
 */
public class RemoteControl
{
    public ICommand[] OnCommands;
    public ICommand[] OffCommands;
    public ICommand UndoCommand;

    public RemoteControl()
    {
        OnCommands = new ICommand[7];
        OffCommands = new ICommand[7];

        //Filling Commands with Empty Values.
        ICommand noCommand = new NoCommand();
        for(int i=0; i < 7; i++)
        {
            OnCommands[i] = noCommand;
            OffCommands[i] = noCommand;
        }
        UndoCommand = noCommand;
    }
    public void SetCommand(int slot, ICommand onCommand, ICommand offCommand)
    {
        OnCommands[slot] = onCommand;
        OffCommands[slot] = offCommand;
    }
    public void PressOn(int slot)
    {
        OnCommands[slot].Execute();
        //Storing Undo Value
        UndoCommand = OffCommands[slot];
    }
    public void PressOff(int slot)
    {
        OffCommands[slot].Execute();
        UndoCommand = OnCommands[slot];
    }
    public void PressUndo()
    {
        UndoCommand.Execute();
    }
    public void DisplayCommands()
    {
        for(int i=0; i < OnCommands.length; i++)
        {
            System.out.println("Slot: " + i + " ON: " + OnCommands[i].getClass().getName() + " OFF: " + OffCommands[i].getClass().getName());
        }
    }
}
