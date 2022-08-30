package observer;

import observable.NewsAgencyObservable;

public class GothamChannelObserver implements IObserver {
    NewsAgencyObservable news;

    public GothamChannelObserver(NewsAgencyObservable news) {
        this.news = news;
    }

    /**
     * Being notified.
     */
    @Override
    public void update() {
        System.out.println(news.getNewsDescription() + "\n\tSincerely, your Truthful Gotham channel.\n");
    }

    /**
     * Name of the channel.
     */
    @Override
    public String toString() {
        return "Truthful Gotham channel";
    }
}
