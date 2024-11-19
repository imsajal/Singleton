package org.demo;

public class ThreadSafeSingleton {

    private static  ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    // sncronizing the method itself reduces the performance
    public static synchronized ThreadSafeSingleton getInstance()
    {
        if(instance == null) instance = new ThreadSafeSingleton();
        return instance;
    }
}
