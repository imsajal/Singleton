package org.demo;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){

    }
    // instance is initialized lazily when required first
    public static LazySingleton getInstance(){
        if(instance == null) instance = new LazySingleton();
        return instance;
    }
}
