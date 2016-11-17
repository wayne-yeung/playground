package com.waynetech;

public class Main {

    public static void main(String[] args) throws Exception{
	// Program that shows the order of initialization in derived and parent class
        Derived derived = new Derived();
        // Initialization takes place in the following order
        // 1. Static variable in the super class
        // 2. Static method in the super class
        // 3. Static variable in the derived class
        // 4. Static method in the derived class
        // 5. Local variable in the super class
        // 6. Constructor in the super class
        // 7. Local variable in the super class
        // 8. Constructor in the derived class
        System.in.read();
    }
}
