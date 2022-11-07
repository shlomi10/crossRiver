package serpapi.threads;

import serpapi.GoogleSearchTest;
import serpapi.SerpApiSearchException;

/**
 * this class represent the thread that implements runnable for Google search
 */

public class ThreadGoogle implements Runnable{

    GoogleSearchTest googleSearchTest = new GoogleSearchTest();

    public void run(){
        System.out.println("Run thread google");
        try {
            googleSearchTest.searchCoffee();
        } catch (SerpApiSearchException e) {
            throw new RuntimeException(e);
        }
    }

}
