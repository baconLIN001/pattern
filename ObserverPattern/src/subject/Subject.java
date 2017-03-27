package subject;

import observer.Observer;

/**
 * Created by bacon on 2017/3/27.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void remoceObserver(Observer observer);
    public void notifyObservers();
}
