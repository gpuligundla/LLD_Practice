package DesignPatterns.BehavioralPatterns.Mediator.GoodCode;

public class User {
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String msg){
        mediator.sendMessage(msg, this);
    }

    public void receiveMessage(String msg, User sender){
        System.out.println(name +" received the message "+msg+ " from the sender "+ sender.getName());
    }

    public String getName(){
        return name;
    }
}
