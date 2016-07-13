/**
 * Created by conor.mcgrath on 13/07/2016.
 */
public class Launcher
{
    public static void main (String [] args)
    {
        System.out.println("Template Pattern:");
        System.out.println("Preparing Coffee:");
        Coffee coffee = new Coffee();
        coffee.PrepareReceipe();

        System.out.println("Preparing Tea Recipe:");
        Tea tea = new Tea();
        tea.PrepareReceipe();

    }
}
