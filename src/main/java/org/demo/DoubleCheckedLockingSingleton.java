package org.demo;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance ;
    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance(){

        if(instance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(instance == null){ // prevent second thread to create instance again for first time
                    instance  = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
