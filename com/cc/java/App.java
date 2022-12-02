package com.cc.java;

public class App {
    
    // Aufgabe 7 
    public static void main(String[] args) {
        Test test = new Test(false, null, null, 0, 0, null);

        System.out.println(test.getItem());

        test.setItem("test");

        System.out.println(test.getItem());
    }
    
}
