
package com.mypackage;

public class Tester {

    public static void main(String[] args) throws Exception {

        Singleton obj1 =  Singleton.getInstance();
        Singleton obj2 =  Singleton.getInstance();

        System.out.println("Obj1 Hashcode --> " + obj1.hashCode());
        System.out.println("Obj2 Hashcode --> " + obj2.hashCode());

        System.out.println(obj1 == obj2);


    }
}