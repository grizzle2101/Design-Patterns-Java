/**
 * Created by conor.mcgrath on 12/07/2016.
 */
public class TurkeyAdapter implements Duck
{
    Turkey turkey;
    public TurkeyAdapter(Turkey t)
    {
        this.turkey = t;
    }
    public void fly()
    {
        turkey.glide();
    }
    public void quack()
    {
        turkey.gobble();
    }
}
