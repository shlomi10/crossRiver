package serpapi.threads;

import serpapi.SerpApiSearchException;
import serpapi.YahooSearchTest;

/**
 * this class represent the thread that implements runnable for Yahoo search
 */

public class ThreadYahoo implements Runnable{

    YahooSearchTest yahooSearchTest = new YahooSearchTest();

    public void run(){
        System.out.println("Run thread Yahoo");
        try {
            yahooSearchTest.searchCoffee();
        } catch (SerpApiSearchException e) {
            throw new RuntimeException(e);
        }
    }

}
