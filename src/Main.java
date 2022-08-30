import observable.NewsAgencyObservable;
import observer.GothamChannelObserver;

public class Main {

    public static void main(String[] args) {
        NewsAgencyObservable newsAgency = new NewsAgencyObservable(); // Initialize news agency.
        GothamChannelObserver channel = new GothamChannelObserver(newsAgency); // Initialize the channel which will receive news.

        // Add the channel to the list of news agency subscribers.
        newsAgency.add(channel);
        System.out.println();

        // Create two news. Notifying is happening.
        newsAgency.setNewsDescription("The Batman (2022) movie is published.");
        newsAgency.setNewsDescription("Stocks of Wayne Enterprises rose today.");

        System.out.println();
        newsAgency.remove(channel); // Remove the channel from the list of subscribers.

        // Channel will not receive this news because it is unsubscribed.
        newsAgency.setNewsDescription("Riddler was sent to the Arkham asylum.");
    }
}
