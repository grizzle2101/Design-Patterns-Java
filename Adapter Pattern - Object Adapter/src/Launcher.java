/**
 * Created by conor.mcgrath on 12/07/2016.
 */
public class Launcher
{
        public static void main (String [] args)
        {
            System.out.println("Adapter Pattern:");

            Turkey terrance = new Turkey();

            terrance.glide();
            terrance.gobble();


            //Putting terrance through the Turkey Adapter
            TurkeyAdapter t2 = new TurkeyAdapter(terrance);

            //Using Duck Methods
            t2.fly();
            t2.quack();


        }
}
