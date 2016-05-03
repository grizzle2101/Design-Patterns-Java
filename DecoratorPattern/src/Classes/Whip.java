package Classes;

/**
 * Created by conor.mcgrath on 03/05/2016.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage b)
    {
        this.beverage =  b;
    }
    public String getDescription()
    {
        return beverage.getDescription() + ", Whip";
    }
    public double cost()
    {
        return .10 + beverage.cost();
    }
}