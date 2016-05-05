/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public class PizzaFactory
{
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        if(type.equals("cheese"))
        {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
