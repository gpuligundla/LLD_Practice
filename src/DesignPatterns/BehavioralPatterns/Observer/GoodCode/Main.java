package DesignPatterns.BehavioralPatterns.Observer.GoodCode;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        DisplayDeviceMobile mobile = new DisplayDeviceMobile();
        weatherStation.addObserver(mobile);
        DisplayDeviceTV tv = new DisplayDeviceTV();
        weatherStation.addObserver(tv);
        weatherStation.setTemp(44);
    }
}

/*
This example covers the Observer pattern of the weather station example. Here the main components are subject and the
observer interfaces. from Subject, we by default cover functions like add, remove and notify the observers which is then
imlemented by the concrete subject class, in this example it is weatherstation. we can create as many observers we need
by implementing the observer interface so that dyanamically we can scale without changing any existing code.

 */