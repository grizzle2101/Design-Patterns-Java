package Classes;

import Interfaces.IObserver;

/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public class CurrentConditionsDisplay implements IObserver
{
    int temperatrure, humidity, pressure;
    public void Update(int t, int h, int p)
    {
        this.temperatrure = t;
        this.humidity = h;
        this.pressure = p;
        Display();
    }
    public void Display()
    {
        System.out.println("Current Conditions: " + temperatrure + "C " + humidity + "% " + pressure + " Bars");
    }
}
