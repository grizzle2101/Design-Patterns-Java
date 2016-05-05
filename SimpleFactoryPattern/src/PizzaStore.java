/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public class PizzaStore
{
    PizzaFactory factory;
    public PizzaStore(PizzaFactory factory)
    {
        this.factory = factory;
    }
    public Pizza orderPizza(String type)
    {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        return pizza;
    }
}
