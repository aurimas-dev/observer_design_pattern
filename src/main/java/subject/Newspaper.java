package subject;

import observers.IObserver;

import java.util.ArrayList;

public class Newspaper implements ISubject {
    private ArrayList<IObserver> subscribers;
    private int num;

    public Newspaper(int num) {
        this.subscribers = new ArrayList<IObserver>();
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
        notifySubscribers();
    }

    public void subscribe(IObserver observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(IObserver observe) {
        int i = subscribers.indexOf(observe);
        if (i >= 0) {
            subscribers.remove(i);
        }
    }

    public void notifySubscribers() {
        for (IObserver subscriber : subscribers) {
            subscriber.update(num);
        }
    }
}
