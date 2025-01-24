package DesignPatterns.BehavioralPatterns.Observer.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private float temp;
    private final List<Observer> observerList;

    public WeatherStation(){
        observerList = new ArrayList<>();
    }

    public void setTemp(float temp){
        this.temp = temp;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj:observerList){
            obj.update(temp);
        }

    }
}
