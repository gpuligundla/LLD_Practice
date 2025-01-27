package DesignPatterns.BehavioralPatterns.Mediator.GoodCode;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        User gk = new User("GK", chatRoom);
        User harish = new User("Harish", chatRoom);
        User balu = new User("Balu", chatRoom);

        chatRoom.addUser(gk);
        chatRoom.addUser(harish);
        chatRoom.addUser(balu);

        gk.sendMessage("Hello");
    }
}

/*
In this package, we can see the implementation of the mediator pattern. Here we implemented the chat application where
when the user sends the message to the chat room it will be set to all other participants in the chatroom.

we have a mediator interface which is implemented by the chatroom and users use this concrete class as a centralized
point to communicate with other users.
 */