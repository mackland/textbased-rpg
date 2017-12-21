package main;

import model.*;
import view.*;

public class Main{
    public static void main(String[] args){
        World game = new World();
        Display display = new Display();
        Player player1 = new Player(20, 20, 4, 0, "Marcus");
        Creature creature = new Creature(20, 20, 4, 0, "Skeleton");
        Battle battle;

        game.setUp();
        game.printBoard();
        char mov = display.getDirections();
        int dx = 0;
        int dy = 0;
        if(mov == 'n'){
            dx = 0;
            dy = 1;
        } else if(mov == 's') {
            dx = 0;
            dy = -1;
        } else if(mov == 'e') {
            dx = 1;
            dy = 0;
        } else if(mov == 'w') {
            dx = -1;
            dy = 0;
        }
        player1.move(dx, dy);
        
        display.enemyAppeared();
        battle = new Battle(player1, creature, display);
        battle.start();
    }
/*
    public char getInput(){
        System.out.println("========================================");
        System.out.println("Where do you want to go?");
        System.out.println("North (n), South (s), West (w), or East (e)?");
        System.out.println("Where do you want to go?");
        char inChar = (char) System.in.read();
        return inChar;
    }
*/
}
