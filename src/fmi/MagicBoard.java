package fmi;

import java.util.ArrayList;
import java.util.List;

import static fmi.Constants.BICYCLE_COMMAND;
import static fmi.Constants.DOLL_COMMAND;

public class MagicBoard implements Observable {

    private final List<Observer> observers;
    private String command;

    public MagicBoard() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setObservable(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
        observer.setObservable(null);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return command;
    }

    public void requestDoll() {
        System.out.println("Magic board wrote: \"" + DOLL_COMMAND + "\"");
        this.command = DOLL_COMMAND;
        this.notifyObservers();
    }

    public void requestBicycle() {
        System.out.println("Magic board wrote: \"" + BICYCLE_COMMAND + "\"");
        this.command = BICYCLE_COMMAND;
        this.notifyObservers();
    }

    public void undoCommand() {
        System.out.println("Magic board undid the last command");
        this.command = null;
        this.notifyObservers();
    }
}
