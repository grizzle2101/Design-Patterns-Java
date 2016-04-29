package Classes;

import Interfaces.IObserver;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;

/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public class WeatherReport implements IObserver
{
    int temperature, humidity, pressure;

    public void Update(int t, int h, int p)
    {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        Display();
    }
    public void Display()
    {
        if(temperature >= 25 && humidity >= 75)
        {
            System.out.println("Weather Report: It Gone be Hot.");
        }
        else
        {
            System.out.println("Weather Report: Bring an Umbrella.");
        }

    }
}
