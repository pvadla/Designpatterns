package behavioral.observer;

import java.util.ArrayList;
import java.util.Currency;

public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);


        weatherData.setMeasurement(20.4F, 30.4F, 40.4F);









    }
}
