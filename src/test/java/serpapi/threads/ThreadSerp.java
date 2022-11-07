package serpapi.threads;

import serpapi.SerpApiClientTest;
import serpapi.SerpApiSearchException;

/**
 * this class represent the thread that implements runnable for Serp search
 */

public class ThreadSerp implements Runnable{

    SerpApiClientTest serpApiClientTest = new SerpApiClientTest();

    public void run(){
        System.out.println("Run thread Serp");
        try {
            serpApiClientTest.searchCoffee();
        } catch (SerpApiSearchException e) {
            throw new RuntimeException(e);
        }
    }

}
