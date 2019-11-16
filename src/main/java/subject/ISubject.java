package subject;

import observers.IObserver;

public interface ISubject {
    public void subscribe(IObserver observer);
    public void unsubscribe(IObserver observe);
    public void notifySubscribers();
}
