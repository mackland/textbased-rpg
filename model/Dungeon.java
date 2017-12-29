package model;

public class Dungeon{
    private boolean northDirection = false;
    private boolean southDirection = false;
    private boolean westDirection = false;
    private boolean eastDirection = false;
    private Player player;
    private boolean cleared = false;
    private Room[][] dungeon;

    public Dungeon initializeDungeon(String dungeon, Player player){
        switch(dungeon){
            case "cave":
                return newDungeon(player);
        }
    
    }

    public Room[][] newDungeon(Player player){
        this.player = player;
        dungeon = new Room[10][10];
        for(int i = 0; i < dungeon.length; i++){
            for(int j = 0; j < dungeon.length; j++){
                dungeon[i][j] = Room.newRoom();
            }
        }
        return dungeon; 
    }
    
    private void initializeDungeon(){
        while(!cleared || player.getHealth() > 0){
            
        }
    }
    
    public void changeRoom(char input){
        switch(input){
            case '1':
                System.out.println("Go north.");
            case '2':
                System.out.println("Go south");
            case '3':
                System.out.println("Go west");
            case '4':
                System.out.println("Go east");

        }
    }

    public boolean[] possibleDirections(){
        boolean[] output = new boolean[4];
        output[0] = northDirection;
        output[1] = southDirection;
        output[2] = westDirection;
        output[3] = eastDirection;

        return output;
    }
    
    public static void main(String args[]){
        System.out.println("Cave dungeon!");
        //    dungeon = newDungeon(player);
    }
}
