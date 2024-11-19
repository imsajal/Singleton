package org.demo;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    // it is thread safe
    public static EagerSingleton getInstance(){
        return instance;
    }
}
