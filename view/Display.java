package view;

import java.io.*;

public class Display{
    public char getDirections() {
        char inChar = 's';

        System.out.println("Where do you want to go?...");
        System.out.println("North (n)");
        System.out.println("South (s)");
        System.out.println("West (s)");
        System.out.println("East (e)");
        try{
            inChar = (char) System.in.read();
        } catch(IOException ioe) {
            System.out.println("Invalid input!");
        }
        return inChar;
    }

}
