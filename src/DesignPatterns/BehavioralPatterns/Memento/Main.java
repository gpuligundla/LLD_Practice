package DesignPatterns.BehavioralPatterns.Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker();
        editor.write("Hello Java");
        careTaker.saveState(editor);
        editor.write("Hello CPP");
        careTaker.saveState(editor);
        System.out.println(editor.getContent());
        careTaker.restoreState(editor);
        System.out.println(editor.getContent());
    }
}

// In momento pattern we will have 3 components. They are Originator, Momento, Caretaker. Here Momento class is used
// to capture the state of the originator class and Caretaker will be like an helper class where it saves and restores
// the state of the object.

/*
originator class
It is the main class which needs its state to be preserved
in this class, we will have save and restore functions.

momento class
This class will be a clone of attributes from the originator with final since they dont get changed.
This class will just preserve the state and will have a function getContent() to return when asked.

caretaker class
This class will contains a stack attribute called history to store the states of the originator whenever asked.
It will have saveState and undoState functions which push/pop to the stack.

In the driver class, we need to intiate the caretaker along with originator and whenever we need to save the
state/restore, we can call the caretaker object.
*/


