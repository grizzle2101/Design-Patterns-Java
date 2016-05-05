/**
 * Created by conor.mcgrath on 04/05/2016.
 */
public class CaliIngredientFactory implements PizzaIngredientFactory
{
    public Dough createDough()
    {
        return new ThinCrust();
    }
    public Cheese createCheese()
    {
        return new Cheddar();
    }
    public Pepperoni createPepperoni()
    {
        return new PepperoniCubes();
    }
}
