package controller;

import model.*;
import view.*;

import java.io.*;

public class Controlls{
    public void startGame(){
        World game = new World();
        Display display = new Display();
        Player player1 = new Player(20, 20, 4, 0, "Marcus");
        Creature creature = new Creature(20, 20, 4, 0, "Skeleton");
        Battle battle;
        Dungeon dungeon;

        game.setUp();
        display.firstMessage();
        display.firstDecision();
        //printBoard(game.getBoard());
        //display.getDirections();
        char input = getInput();
        switch(input){
            case '1':
                display.enterDungeon("cave");
                dungeon = newDungeon("cave", player);
                while(!dungeon.isCleared() && player.getHealth() > 0){
                    display.getDirections();
                    char input = getInput();
                    dungeon.changeRoom(input);
                    //get input
                    //goto room
                    //battle
                    //goto room
                }
                //Dungeon cave = new Dungeon(player1);
                //cave.newDungeon(player1);
            case '2':
              
        }
        
        //game.updatePosition(input);
        //display.printBoard(game.getBoard());
        //model update position
        //when enter new position on board
        //random chance to fight enemy

        //display.enemyAppeared();
        //game.startBattle();
        //battle = new Battle(player1, creature, display);
        //battle.start();
    }

    public char getInput(){
        char inChar = 'x';
        try{
            inChar = (char) System.in.read();
        } catch(IOException ioe) {
        
        }
        return inChar;
    }

    public static void main(String[] args){
        Controlls c = new Controlls();
        c.startGame();
    }

}
