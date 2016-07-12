/**
 * Created by conor.mcgrath on 12/07/2016.
 */
public class TurkeyAdapter implements Duck, Turkey
{
    public void fly()
    {
        glide();
    }
    public void quack()
    {
        gobble();
    }
    public void gobble()
    {
        System.out.println("Gobble!");
    }
    public void glide()
    {
        System.out.println("Glide");
    }
}
