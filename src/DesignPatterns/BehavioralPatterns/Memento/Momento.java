package DesignPatterns.BehavioralPatterns.Memento;

public class Momento {
    private final String content;

    public Momento(String msg){
        this.content = msg;
    }

    public String getContent(){
        return content;
    }
}

// Momento class captures the state and make it final since it wont change once captured and we use caretaker class to
// save this instance of momento.
