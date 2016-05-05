/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public class PepperoniPizza extends Pizza
{
    PizzaIngredientFactory factory;

    public PepperoniPizza(PizzaIngredientFactory f)
    {
        this.factory = f;
    }
    public void Prepare()
    {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        cheese = factory.createCheese();
        pepperoni = factory.createPepperoni();
        System.out.println("Ingredients: " + dough.ToString() + ", " + cheese.ToString() + ", " + pepperoni.ToString());
    }
}
