package com.waynetech;

/**
 * Created by wayneyeung on 12/11/2016.
 */
public class Super {

    private static JustForPrint justForPrint = new JustForPrint("the static object justForPrint in super class is being instantiated");

    private JustForPrint justForPrintField = new JustForPrint("The non-static object in Super class is created");

    static {
        System.out.println("the static method in Super class is called.");
    }

    public Super(){

        System.out.println("Constructor in super class is called!");
    }
}
