/**
 * Created by conor.mcgrath on 12/07/2016.
 */
public class Launcher
{
        public static void main (String [] args)
        {
            System.out.println("Adapter Pattern:");

            WildTurkey terrance = new WildTurkey();

            terrance.display();

            //Using Duck Methods
            terrance.fly();
            terrance.quack();

            //Using Turkey Methods
            terrance.glide();
            terrance.gobble();

        }
}
