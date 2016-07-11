/**
 * Created by conor.mcgrath on 11/07/2016.
 */
public class Launcher
{
    public static void main (String [] args)
    {
        System.out.println("Command Pattern: ");

        //Create Remote
        RemoteControl remote = new RemoteControl();

        //Create Appliance
        Light light = new Light("Living Room");
        CeilingFan fan = new CeilingFan("Bathroom");

        //Create ON Commands
        LightOnCommand lighton = new LightOnCommand(light);
        FanHighCommand fanhigh = new FanHighCommand(fan);

        //Create OFF Commands
        LightOffCommand lightoff = new LightOffCommand(light);
        FanOffCommand fanoff = new FanOffCommand(fan);

        //Assign to Remote
        remote.SetCommand(0, lighton, lightoff);
        remote.SetCommand(1, fanhigh, fanoff);

        //Macro Party Button
        ICommand[] onCommands = {lighton, fanhigh};
        MacroCommand partyOnButton = new MacroCommand(onCommands);

        ICommand[] offCommands = {lightoff, fanoff};
        MacroCommand partyOffButton = new MacroCommand(offCommands);

        remote.SetCommand(2, partyOnButton, partyOffButton);

        //Using Remote
        remote.PressOn(2);
        remote.PressOff(2);
        remote.PressUndo();

        remote.DisplayCommands();


    }
}
