package Classes;

/**
 * Created by conor.mcgrath on 03/05/2016.
 */
public class Soy extends  CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage b)
    {
        this.beverage = b;
    }
    public String getDescription()
    {
        return beverage.getDescription() + ", Soy";
    }
    public double cost()
    {
        return beverage.cost() + .15;
    }
}
