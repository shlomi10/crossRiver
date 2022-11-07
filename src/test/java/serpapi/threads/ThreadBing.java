package serpapi.threads;

import serpapi.BingSearchTest;
import serpapi.SerpApiSearchException;

/**
 * this class represent the thread that implements runnable for Bing search
 */

public class ThreadBing implements Runnable{
    BingSearchTest bingSearchTest = new BingSearchTest();

    public void run(){
        System.out.println("Run thread Bing");
        try {
            bingSearchTest.searchCoffee();
        } catch (SerpApiSearchException e) {
            throw new RuntimeException(e);
        }

    }
}
