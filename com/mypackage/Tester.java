package com.mypackage;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"))) {
            out.writeObject(singleton1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        Singleton singleton2 = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"))) {
            singleton2 = (Singleton) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Are both instances the same after deserialization? " + (singleton1 == singleton2));

        if (singleton2 != null) {
            singleton2.doSomething();
        }
    }
}
