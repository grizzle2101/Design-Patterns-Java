/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public class CaliPizzaStore extends PizzaStore
{
    PizzaIngredientFactory factory = new CaliIngredientFactory();

    public Pizza createPizza(String item)
    {
        Pizza pizza = null;

        if(item.equals("cheese"))
        {
            pizza = new CheesePizza(factory);
            pizza.setName("California Style Cheese Pizza");
        }
        else if(item.equals("pepperoni"))
        {
            pizza = new PepperoniPizza(factory);
            pizza.setName("California Style Pepperoni Pizza");
        }

        return pizza;
    }
}
