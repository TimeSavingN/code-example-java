package com.taogen.example.java.basic.reflection.example.cglib;

/**
 * @author Taogen
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("request to RealSubject...");
    }
}
