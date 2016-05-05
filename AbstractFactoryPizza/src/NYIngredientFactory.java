public class NYIngredientFactory implements PizzaIngredientFactory
{
    public Dough createDough()
    {
        return new ThickCrust();
    }
    public Cheese createCheese()
    {
        return new MozerellaCheese();
    }
    public Pepperoni createPepperoni()
    {
        return new ThinSlicedPepperoni();
    }
}
