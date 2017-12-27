package view;

import java.util.concurrent.TimeUnit;
import java.io.*;

public class Display{
    public void getDirections() {
        for(int i = 0; i < 100; i++) System.out.println();
        System.out.println("--- Where do you want to go? ---");
        System.out.println("1. North.....(n)");
        System.out.println("2. South.....(s)");
        System.out.println("3. West......(w)");
        System.out.println("4. East......(e)");
    }

    public void firstMessage(){
        try{
        System.out.println("///////////////////////////////////////////////////////////////////////");
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("what is that over there?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You open your eyes as you hear a group of mercenaries closing in");
        } catch(InterruptedException ie) {
            System.out.println("Something went wrong!");
        }
    }

    public void firstDecision(){
        System.out.println("///////////////////////////////////////////////////////////////////////");
        System.out.println("------- 1. Hide inside the cave hoping they don't catch you     -------");
        System.out.println("------- 2. Look around for something to fight them with         -------");
        System.out.println("------- 3. Try to run away                                      -------");
        System.out.println("------- 4. Talk with them and see if you can trade some items   -------");
    }

    public void enterDungeon(String dungeonName){
        System.out.println("Seeking cover you run into the dark cave, not thinking what lurks inside is even worse...");
    }

    public void printBoard(String[][] board){
        for(int i = 0; i < 100; i++) System.out.println();
        
        for(String[] row : board){
            for(String loc : row){
                System.out.print(loc);
            }
            System.out.println();
        }
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
