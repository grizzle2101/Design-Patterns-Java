package Classes;

import Interfaces.IObserver;
import Interfaces.ISubject;

/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public class Launcher
{
    public static void main (String [] args)
    {
        System.out.println("Observer Pattern:");

        WeatherStation station = new WeatherStation();
        IObserver display = new CurrentConditionsDisplay();
        IObserver report = new WeatherReport();

        station.RegisterObserver(display);
        station.RegisterObserver(report);
        station.SetMeasurements(26, 76, 102);

    }
}
