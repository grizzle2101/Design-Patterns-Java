/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza = null;
        pizza = createPizza(type);
        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
