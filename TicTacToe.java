

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe{
  
   public static void main(String[] args){
      Scanner input= new Scanner(System.in);
      
      String[][] gameboard={ {"[0,0]","[0,1]","[0,2]"}, {"[1,0]","[1,1]","[1,2]"},{"[2,0]","[2,1]","[2,2]"} };
      //Os=1 Xs=2
      int[][] gameNum={{0,0,0},{0,0,0},{0,0,0}};
      
      for(int i=0; i<gameboard.length; i++)
      {
         System.out.println("");
         for(int j=0; j<gameboard[i].length; j++)
         {
            System.out.print(gameboard[i][j]);
         }
      
      }
      
      System.out.println("\nWelcome to Tic-Tac-Toe! O moves first!");
      
      
      int xPos=0;
      int yPos=0;
      
      
      boolean winner=false;
      System.out.println("O's turn! Enter x coordinate");
      while(input.hasNextInt() || xPos==0){
      
  
         
         xPos=input.nextInt();
         System.out.println(" O's turn! Enter Y coordinate");
         yPos=input.nextInt();
         
         gameboard[xPos][yPos]="O\t";
         gameNum[xPos][yPos]=1;
       for(int i=0; i<gameboard.length; i++)
            {
               System.out.println("");
               for(int j=0; j<gameboard[i].length; j++)
               {
                 System.out.print(gameboard[i][j]);
               }
      
            }
            
      for(int i=0; i<3; i++){ //checks rows for wins 
    
      if( (gameNum[i][0]==1 && gameNum[i][1]==1 &&gameNum[i][2]==1) || (gameNum[i][0]==2 && gameNum[i][1]==2 &&gameNum[i][2]==2) )
      {
         System.out.println("");
         System.out.printf("\n%swins",gameboard[i][0] );
         winner=true;
         break;
         
      }
      
    }
    
    for(int i=0; i<3; i++){ //checks columns for wins 
    
      if( (gameNum[0][i]==1 && gameNum[1][i]==1 &&gameNum[2][i]==1) || (gameNum[0][i]==2 && gameNum[1][i]==2 &&gameNum[2][i]==2) )
      {
         System.out.println("");
         System.out.printf("\n%swins",gameboard[0][i]);
         winner=true;
         break;
         
      }
      
    }
    
    if( ( (gameNum[0][0]==1&&gameNum[1][1]==1 && gameNum[2][2]==1) || (gameNum[0][0]==2&&gameNum[1][1]==2&&gameNum[2][2]==2) )||( (gameNum[0][2]==1 && gameNum[1][1]==1&&gameNum[2][0]==1) || (gameNum[0][2]==2 && gameNum[1][1]==2 &&gameNum[2][0]==2) ) ){//checks diagonals for winners
      System.out.printf("\n%swins",gameboard[1][1]);
      break;
    }

    
    
    if(winner==true){
    
      break;
    }
      System.out.println(" ");
      System.out.println("X's turn! Enter x coordinate");
      xPos=input.nextInt();
      System.out.println(" X's turn! Enter Y coordinate");
      yPos=input.nextInt();
      gameboard[xPos][yPos]="X\t";
      gameNum[xPos][yPos]=2;
       for(int i=0; i<gameboard.length; i++)
            {
               System.out.println("");
               for(int j=0; j<gameboard[i].length; j++)
               {
                 System.out.print(gameboard[i][j]);
               }
      
            }
            
        for(int i=0; i<3; i++){ //checks rows for wins 
    
      if( (gameNum[i][0]==1 && gameNum[i][1]==1 &&gameNum[i][2]==1) || (gameNum[i][0]==2 && gameNum[i][1]==2 &&gameNum[i][2]==2) )
      {
         System.out.println("");
         System.out.printf("\n%swins",gameboard[i][0] );
         winner=true;
         break;
         
      }
      
    }
    
    
    
    for(int i=0; i<3; i++){ //checks columns for wins 
    
      if( (gameNum[0][i]==1 && gameNum[1][i]==1 &&gameNum[2][i]==1) || (gameNum[0][i]==2 && gameNum[1][i]==2 &&gameNum[2][i]==2) )
      {
         System.out.println("");
         System.out.printf("\n%swins",gameboard[0][i]);
         winner=true;
         break;
         
      }
      
  }
  
   if( ( (gameNum[0][0]==1&&gameNum[1][1]==1 && gameNum[2][2]==1) || (gameNum[0][0]==2&&gameNum[1][1]==2&&gameNum[2][2]==2) )||( (gameNum[0][2]==1 && gameNum[1][1]==1&&gameNum[2][0]==1) || (gameNum[0][2]==2 && gameNum[1][1]==2 &&gameNum[2][0]==2) ) ){//checks diagonals for winners
      System.out.printf("\n%swins",gameboard[1][1]);
      break;
    }
    
    if(winner==true){
    
      break;
      }




            
      
      System.out.println("\n O's turn! Enter x coordinate");

      }
      
      
      
   }
   
   

}
