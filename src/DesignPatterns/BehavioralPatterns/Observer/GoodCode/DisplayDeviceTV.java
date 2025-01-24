package DesignPatterns.BehavioralPatterns.Observer.GoodCode;

public class DisplayDeviceTV implements Observer{

    @Override
    public void update(float temp){
        System.out.println("CurrentTemp on TV is "+temp+ " C");
    }
}
