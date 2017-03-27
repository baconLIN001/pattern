package subject;

import observer.Observer;

import java.util.ArrayList;

/**
 * Created by bacon on 2017/3/27.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float humidity;
    private float pressure;
    private float temperature;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remoceObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index>=0)
        {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i=0;i<observers.size();i++)
        {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMessurements(float temperature, float humidity, float pressure)
    {
        this.humidity=humidity;
        this.temperature=temperature;
        this.pressure=pressure;
        measurementsChanged();
    }
}
