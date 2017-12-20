package main;

import model.*;
public class Main{
    public static void main(String[] args){
        World game = new World();
        game.printBoard();
        game.setUp();
        game.printBoard();
    }
}
