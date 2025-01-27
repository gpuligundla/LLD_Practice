package DesignPatterns.BehavioralPatterns.Mediator.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

    private List<User> userList;

    public ChatRoom(){
        userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User sender){
        for(User user: userList){
            if(user != sender)
                user.receiveMessage(msg, sender);
        }
    }

    @Override
    public void addUser(User user){
        userList.add(user);
    }

}
