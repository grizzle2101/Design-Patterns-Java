package Classes;

/**
 * Created by conor.mcgrath on 03/05/2016.
 */
public abstract class Beverage {
    String description = "Unknwon";

    public String getDescription()
    {
        return description;
    }
    public abstract double cost();
}
