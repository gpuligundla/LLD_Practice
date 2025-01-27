package DesignPatterns.BehavioralPatterns.Mediator;

class User{
    private String name;

    public User(String name){
        this.name = name;
    }
    public void sendMessage(String msg, User user){
        System.out.println("Sending message " + msg + "to the user" + user);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class WithoutMediator {
    public static void main(String[] args) {
        User gk = new User("GK");
        User harish = new User("Harish");
        User balu = new User("Balu");

        gk.sendMessage("Hello", harish);
        gk.sendMessage("Hello", balu);
    }
}

/*

Here we have designed an chat application, if a user sends a message to the chatroom, it should be sent to everyone
in the above example if you observe it is tightly coupled , we need to manually call all the objects in the list to
send the message

To solve this, we can use the mediator pattern
 */