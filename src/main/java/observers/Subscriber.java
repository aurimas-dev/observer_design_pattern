package observers;

import subject.ISubject;

public class Subscriber implements IObserver {
    private String name;

    public Subscriber(String name, ISubject subject) {
        this.name = name;
        subject.subscribe(this);
    }

    public void update(int value) {
        System.out.println(String.format("%s is receiving a value of %d", name, value));
    }
}
