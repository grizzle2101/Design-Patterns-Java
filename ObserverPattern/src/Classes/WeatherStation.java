package Classes;

import Interfaces.IObserver;
import Interfaces.ISubject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public class WeatherStation implements ISubject
{
    List<IObserver> list = new ArrayList<IObserver>();
    int temperature, humidity, pressure;


    public void RegisterObserver(IObserver o)
    {
        list.add(o);
    }
    public void UnregisterObserver(IObserver o)
    {
        list.remove(o);
    }
    public void NotifyObservers()
    {
        for(Iterator<IObserver> i = list.iterator(); i.hasNext(); )
        {
            IObserver o = i.next();
            o.Update(temperature, humidity, pressure);
        }
    }
    public void SetMeasurements(int t, int h, int p)
    {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        NotifyObservers();
    }
}
