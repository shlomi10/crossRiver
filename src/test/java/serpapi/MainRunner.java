package serpapi;

import serpapi.threads.*;
import java.util.ArrayList;
import java.util.List;

public class MainRunner {

    /**
     * main runner of search api with threads
     */
    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(new ThreadYandex()));
        threads.add(new Thread(new ThreadSerp()));
        threads.add(new Thread(new ThreadBaidu()));
        threads.add(new Thread(new ThreadEbay()));
        threads.add(new Thread(new ThreadBing()));
        threads.add(new Thread(new ThreadGoogle()));
        threads.add(new Thread(new ThreadYahoo()));

        for(Runnable myThread: threads) {
            myThread.run();
        }

        // Second option
        System.out.println("\n");
        System.out.println("Second option: \n");
        Thread yandex = new Thread(new ThreadYandex());
        Thread serpSearch = new Thread(new ThreadSerp());
        Thread baiduSearch = new Thread(new ThreadBaidu());
        Thread ebaySearch = new Thread(new ThreadEbay());
        Thread bingSearch = new Thread(new ThreadBing());
        Thread googleSearch = new Thread(new ThreadGoogle());
        Thread yahooSearch = new Thread(new ThreadYahoo());

        bingSearch.start();
        yandex.start();
        serpSearch.start();
        baiduSearch.start();
        ebaySearch.start();
        googleSearch.start();
        yahooSearch.start();

    }
}
