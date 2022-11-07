package serpapi.threads;

import serpapi.EbaySearchTest;
import serpapi.SerpApiSearchException;

/**
 * this class represent the thread that implements runnable for Ebay search
 */
public class ThreadEbay implements Runnable{

    EbaySearchTest ebaySearchTest = new EbaySearchTest();

    public void run(){
        System.out.println("Run thread Ebay");
        try {
            ebaySearchTest.searchCoffee();
        } catch (SerpApiSearchException e) {
            throw new RuntimeException(e);
        }
    }
}
