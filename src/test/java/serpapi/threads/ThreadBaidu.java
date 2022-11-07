package serpapi.threads;

import serpapi.BaiduSearchTest;
import serpapi.SerpApiSearchException;

/**
 * this class represent the thread that implements runnable for Baidu search
 */

public class ThreadBaidu implements Runnable{

    BaiduSearchTest baiduSearchTest = new BaiduSearchTest();

    public void run(){
        System.out.println("Run thread Baidu");
        try {
            baiduSearchTest.searchCoffee();
        } catch (SerpApiSearchException e) {
            throw new RuntimeException(e);
        }
    }

}
