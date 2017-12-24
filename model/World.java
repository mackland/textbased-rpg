package model;

public class World{
    private int currX = 5;
    private int currY = 5;
    
    public String[][] a = new String[10][10];
    
    public void setUp(){
        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                a[row][col] = "#";
            }
        }
        a[currY][currX] = "O";
    }

    public String[][] getBoard(){
        return a;
    }
/*
    public void printBoard(){
        for(String[] row : a){
            for(String loc : row){
                System.out.print(loc);
            }
            System.out.println();
        }
    }
*/
    public void updatePosition(char direction){
        int x=0; int y=0;
        if(direction == 'n'){
            x = 0; 
            y = 1;
        } else if(direction == 's') {
            x = 0;
            y = -1;
        } else if(direction == 'w') {
            x = 1;
            y = 0;
        } else if(direction == 'e') {
            x = -1;
            y = 0;
        } 
        a[currY][currX] = " ";
        currX = currX + x;
        currY = currY + y;
        a[currY][currX] = "O";
    }

}
