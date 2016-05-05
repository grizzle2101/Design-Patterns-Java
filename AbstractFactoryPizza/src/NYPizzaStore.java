/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public class NYPizzaStore extends PizzaStore
{
    PizzaIngredientFactory factory = new NYIngredientFactory();

    public Pizza createPizza(String item)
    {
        Pizza pizza = null;

        if(item.equals("cheese"))
        {
            pizza = new CheesePizza(factory);
            pizza.setName("NY Cheese Pizza");
        }
        else if(item.equals("pepperoni"))
        {
            pizza = new PepperoniPizza(factory);
            pizza.setName("NY Pepperoni Pizza");
        }

        return pizza;
    }
}
