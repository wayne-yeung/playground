package com.waynetech;

/**
 * Created by wayneyeung on 12/11/2016.
 */
public class Derived extends Super {

    private static JustForPrint justForPrint = new JustForPrint("the static object justForPrint in derived class is being instantiated");

    private JustForPrint justForPrintField = new JustForPrint("The non-static object in Derived class is created");

    static {
        System.out.println("the static method in Derived class is called.");
    }


    public Derived() {

        System.out.println("Constructor in derived class is called.");

    }
}
