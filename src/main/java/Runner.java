import observers.Subscriber;
import subject.Newspaper;

public class Runner {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper(1);
        Subscriber joe = new Subscriber("Joe", newspaper);
        Subscriber peter = new Subscriber("Peter", newspaper);

        newspaper.setNum(2);
        newspaper.unsubscribe(peter);
        newspaper.setNum(4);
    }
}
