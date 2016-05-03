package Classes;

/**
 * Created by conor.mcgrath on 03/05/2016.
 */
public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;
    public SteamedMilk(Beverage b)
    {
        this.beverage =  b;
    }
    public String getDescription()
    {
        return beverage.getDescription() + ", Steamed Milk";
    }
    public double cost()
    {
        return beverage.cost() + 0.10;
    }
}
