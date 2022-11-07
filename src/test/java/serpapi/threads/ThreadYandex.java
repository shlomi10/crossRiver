package serpapi.threads;

import serpapi.YandexSearchTest;
import serpapi.SerpApiSearchException;

/**
 * this class represent the thread that implements runnable for Yandex search
 */

public class ThreadYandex implements Runnable{

    YandexSearchTest yandexSearchTest = new YandexSearchTest();

    public void run(){
        System.out.println("Run thread Yandex");
        try {
            yandexSearchTest.searchCoffee();
        } catch (SerpApiSearchException e) {
            throw new RuntimeException(e);
        }
    }
}
