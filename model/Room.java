package model;

import java.util.Random;

public class Room{
    private static boolean exit = false;
    private static boolean cleared = false;
    
    private static String description;
    private static int numOfMonsters = 0;

    public Room(String desciption, int nOM){
        this.description = description;
        this.numOfMonsters = nOM;
    }

    public static Room newRoom(){
        String description = "";
        int numberOfMonsters = 0;
        
        Random rand = new Random();
        int random = rand.nextInt(4) + 1;
        switch(random){
            case 1:
                description = "A dark corridor";
                numberOfMonsters = 0;
                break;
            case 2:
                description = "As you enter the room, a skeleton jumps out and tries to attack you";
                numberOfMonsters = 1;
                break;
            case 3:
                description = "A resting group of bounty hunters notice you entering the room...";
                numberOfMonsters = 2;
                break;
            case 4:
                description = "You see a treasure located in the middle of the room";
                numberOfMonsters = 0;
                break;
        }
        return new Room(description, numberOfMonsters);    
    }
}
