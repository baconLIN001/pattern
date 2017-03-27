import observer.CurrentConditionsDisplay;
import subject.WeatherData;

/**
 * Created by bacon on 2017/3/27.
 */
public class Test {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMessurements(80,65,30.4f);
        weatherData.setMessurements(82,70,29.2f);
        weatherData.setMessurements(78,90,29.2f);
    }
}
