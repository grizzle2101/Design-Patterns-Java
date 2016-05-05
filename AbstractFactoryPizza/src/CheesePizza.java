/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public class CheesePizza extends Pizza
{
    PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory f)
    {
        this.factory = f;
    }
    public void Prepare()
    {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        cheese = factory.createCheese();
        System.out.println("Ingredients: " + dough.ToString() + ", " + cheese.ToString());
    }
}
