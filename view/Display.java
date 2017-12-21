package view;

import java.io.*;

public class Display{
    public char getDirections() {
        char inChar = 's';

        System.out.println("Where do you want to go?...");
        System.out.println("North (n)");
        System.out.println("South (s)");
        System.out.println("West (w)");
        System.out.println("East (e)");
        try{
            inChar = (char) System.in.read();
        } catch(IOException ioe) {
            System.out.println("Invalid input!");
        }
        return inChar;
    }

    public void enemyAppeared(){
        System.out.println("An enemy has appeared!");
    }

    public void showBattleInfo(int playerHp, int enemyHp) {
        System.out.println("You have " + playerHp + " while enemy has " + enemyHp + "hp");
    }
    
    public void attackInfo(String c1, String c2, int dmg){
        System.out.println(c1 + " has attacked " + c2 + " and caused " + dmg + " damage.");
    }

    public void successfulBattle(String s){
        System.out.println("You have successfully defeated " + s);
    }
}
