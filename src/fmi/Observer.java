package fmi;

public interface Observer {
    void update();

    void setObservable(Observable topic);
}