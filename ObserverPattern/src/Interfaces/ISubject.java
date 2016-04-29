package Interfaces;

/**
 * Created by conor.mcgrath on 28/04/2016.
 */
public interface ISubject
{
    void RegisterObserver(IObserver o);
    void UnregisterObserver(IObserver o);
    void NotifyObservers();
}
