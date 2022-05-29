package observer;

import observable.NewsAgencyObservable;

public class ChannelObserver implements IObserver {
    NewsAgencyObservable news;

    public ChannelObserver(NewsAgencyObservable news) {
        this.news = news;
    }

    /**
     * Being notified.
     */
    @Override
    public void update() {
        System.out.println(news.getNewsDescription());
    }

    /**
     * Name of the channel.
     */
    @Override
    public String toString() {
        return "Truthful Gotham channel";
    }
}
