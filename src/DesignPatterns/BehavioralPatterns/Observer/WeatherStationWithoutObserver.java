package DesignPatterns.BehavioralPatterns.Observer;

class DisplayDevice {
    private String name;
    public DisplayDevice(String name){
        this.name = name;
    }
    public void showTemp(float temp){
        System.out.println("Current Temp at "+ name + " is " + temp + " C");
    }
}

class WeatherStation {
    private float temp;
    private DisplayDevice device;

    public  WeatherStation(DisplayDevice device){
        this.device = device;
    }

    public void setTemp(float temp){
        this.temp = temp;
        notifyDevices();
    }
    public void notifyDevices(){
        device.showTemp(temp);
    }
}

public class WeatherStationWithoutObserver {
    public static void main(String[] args) {
        DisplayDevice device = new DisplayDevice("HillStation");
        WeatherStation weatherStation = new WeatherStation(device);
        weatherStation.setTemp(22);
        weatherStation.setTemp(44);
    }
}

/*
This is example where there is a weather station which is the point which sends the temperature notification to all
the display devices.

If you see here the problem is everything is tightly coupled and if we want to scale this we need to modify the weather
station to support other device types but it violates the open/closed principle.

To fix it we use the observer pattern where it is kind of pub sub model.
 */