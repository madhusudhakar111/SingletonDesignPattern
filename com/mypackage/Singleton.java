package com.mypackage;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static  Singleton getInstance() {
        synchronized (Singleton.class) {  //    T5  ... T1000Thread
            if (instance == null) {   // T4
                instance = new Singleton();
            }
        }
        return instance;
    }
}