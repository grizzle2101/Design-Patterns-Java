/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public abstract class Pizza
{
    String name;
    Dough dough;
    Cheese cheese;
    Pepperoni pepperoni;

    abstract void Prepare();
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void Bake()
    {
        System.out.println("Baking");
    }
    public void Cut()
    {
        System.out.println("Cutting");
    }
    public void Box()
    {
        System.out.println("Boxing");
    }
}
