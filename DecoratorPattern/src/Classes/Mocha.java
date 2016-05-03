package Classes;

/**
 * Created by conor.mcgrath on 03/05/2016.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage b)
    {
        this.beverage = b;
    }
    public String getDescription()
    {
        return beverage.getDescription() + ", Mocha";
    }
    public double cost()
    {
        return .20 + beverage.cost();
    }

}
