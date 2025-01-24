package DesignPatterns.BehavioralPatterns.Memento;

import java.util.Stack;

public class CareTaker {
    private final Stack<Momento> history = new Stack<>();

    public void saveState(TextEditor editor){
        history.push(editor.save());

    }
    public void restoreState(TextEditor editor){
        if(!history.empty()){
            history.pop();
            editor.restore(history.peek());
        }
    }
}
