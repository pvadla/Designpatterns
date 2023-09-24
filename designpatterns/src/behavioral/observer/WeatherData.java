package behavioral.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

    ArrayList<Observer> obsList;
    private float temperature;
    private float humiditiy;
    private float pressure;


    public WeatherData() {
        this.obsList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        obsList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        for(int i = 0; i < obsList.size(); i++){
            if(obsList.get(i) == observer){
                obsList.remove(i);
            }
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < obsList.size(); i++){
            obsList.get(i).update(temperature, humiditiy, pressure);
        }
    }

    public void setMeasurement(float temperature, float humiditiy, float pressure){
        this.temperature = temperature;
        this.humiditiy = humiditiy;
        this.pressure = pressure;
        measurementsChanged();
    }


}
