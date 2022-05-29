package observable;

import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * The news agency has channels as subscribers. When it receives information, it notifies them.
 */
public class NewsAgencyObservable implements IObservable {
    List<IObserver> observers = new ArrayList<>();

    /**
     * Definition of single news.
     */
    private String newsDescription;

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
        System.out.println(observer.toString() + " is added");
    }

    @Override
    public void remove(IObserver observer) {
        System.out.println(observer.toString() + " is removed.");
        observers.remove(observer);
    }

    @Override
    public void inform() {
        for (IObserver observer : observers)
            observer.update();
    }

    /**
     * News agency sets news definition and sends it to the channels.
     */
    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
        inform();
    }

    public String getNewsDescription() {
        return newsDescription;
    }
}



