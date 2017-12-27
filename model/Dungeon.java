package model;

public class Dungeon{
    private static boolean northDirection = false;
    private static boolean southDirection = false;
    private static boolean westDirection = false;
    private static boolean eastDirection = false;

    //private static boolean cleared = false;

    public Room[][] newDungeon(Player player){
        Room[][] dungeon = new Room[10][10];
        for(int i = 0; i < dungeon.length; i++){
            for(int j = 0; j < dungeon.length; j++){
                dungeon[i][j] = Room.newRoom();
            }
        }
        return dungeon; 
    }

    public boolean[] possibleDirections(){
        boolean[] output = new boolean[4];
        output[0] = northDirection;
        output[1] = southDirection;
        output[2] = westDirection;
        output[3] = eastDirection;

        return output;
    }
    

}
