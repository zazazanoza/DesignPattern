package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer obserber) {
        observers.add(obserber);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObserbers() {
        for(Observer o : observers) {
            o.update(this);
        }
    }
    public abstract String getCry();
    public abstract void cry(); //鳴く
    
}
