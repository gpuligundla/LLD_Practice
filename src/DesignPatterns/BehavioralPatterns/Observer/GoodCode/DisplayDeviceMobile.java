package DesignPatterns.BehavioralPatterns.Observer.GoodCode;

public class DisplayDeviceMobile implements Observer{

    @Override
    public void update(float temp){
        System.out.println("CurrentTemp on Mobile is "+temp+ " C");
    }
}
