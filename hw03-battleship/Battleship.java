import java.util.*;
import java.io.*;

/*
Need better input validation, e.g. if not int, invalid input, try again.
Make sure print statements line up with specification.

[] Failed: Doesnt handle out of bound invalid inputs correctly.
[?] Failed: Missed spaces are filled with 'O' character expected:<79> but was:<45>    
[] Failed: Doesnt correctly handle when bad coordinates (out of bound integers) are fired.
[] Failed: You must use at least one do-while loop    
[x] Failed: The correct output and (your) actual output differed on the li t index 2 of actual output. expected:<Enter ship [0] location:> but was:<Enter ship [1] location:> 
[?] Failed: Your Player 1 propmt for the hit is formatted incorrectly

*/

public class Battleship {

  public static void main(String[] args) {
  // location boards - stores player's ship locations and damage states
  // target history boards - stores player's hits/misses of opponent's boards
  
  Scanner input = new Scanner(System.in);
  
  // Welcome message
  System.out.println("Welcome to Battleship!");
  
  
  // Get player coordinates, make location boards and display them
  System.out.println("\nPLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");
  int[][] player1Coord = getCoordinates(input);
  char[][] player1Location = createBoard(player1Coord);
  printBattleShip(player1Location);
  //for (int i = 0; i < 100; i++) System.out.println();
  
  System.out.println("\nPLAYER 2, ENTER YOUR SHIPS’ COORDINATES.");
  int[][] player2Coord = getCoordinates(input);
  char[][] player2Location = createBoard(player2Coord);
  printBattleShip(player2Location);
  //for (int i = 0; i < 100; i++) System.out.println();
  
  // Make player target history board
  char[][] player1Target = createGrid();
  char[][] player2Target = createGrid();
  printBattleShip(player1Target);
  printBattleShip(player2Target);
  
  // This is going to be a while loop until one of the players wins, but until then, simulate 1 step
  //int player1Hits = 0;
  //int player2Hits = 0;
  while (true) {
    // prompt user 2 to fire, check for winner, and print final boards
    fire(1, 2, player1Target, player1Location, player2Location, input);
    if (checkForWinner(player1Target)) {
      System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n");
      System.out.println("Final boards:");
      System.out.println("");
      printBattleShip(player1Location);
      System.out.println("");
      printBattleShip(player1Target);
      break;
    }
    // prompt user 2 to fire, check for winner, and print final boards
    fire(2, 1, player2Target, player2Location, player1Location, input);
    if (checkForWinner(player2Target)) {
      System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n");
      System.out.println("Final boards:");
      System.out.println("");
      printBattleShip(player2Location);
      System.out.println("");
      printBattleShip(player2Target);
      break;
    }
  }

  }
  
  
  // Check if all ships sunks
  public static boolean checkForWinner(char[][] playerTarget) {
    int numInput = 5;
    int counter = 0;
    for (int r = 0; r < playerTarget.length; r++) {
      for (int c = 0; c < playerTarget[r].length; c++) {
        if (playerTarget[r][c] == 'X') {
          counter += 1;
          if (counter == numInput) {
            return true;
          }
        }
      }
    }
    return false;
  }

  
  // Method to fire, can be used for either player a or b
  public static void fire(int playerA, int playerB, 
  			   char[][] playerATarget, 
  			   char[][] playerALocation, 
  			   char[][] playerBLocation, 
  			   Scanner input) {
    int boardSize = 5;
    while (true) {
      System.out.printf("\nPlayer %d, enter hit row/column:\n", playerA);
      int x = input.nextInt();
      int y = input.nextInt();
  
      boolean outOfBounds = (x < 0) || (y < 0) || (x > boardSize-1) || (y > boardSize-1); 
      boolean alreadyFired = outOfBounds || playerATarget[x][y] == 'X' || playerATarget[x][y] == 'O';
      if (outOfBounds) {
        System.out.println("Invalid coordinates. Choose different coordinates.");
      }
      if (alreadyFired) {
        System.out.println("You already fired on this spot. Choose different coordinates.");
      }
    
      if (!outOfBounds && !alreadyFired) {
        if (playerBLocation[x][y] == '@') {
          playerATarget[x][y] = 'X';
          playerBLocation[x][y] = 'X';
          System.out.printf("PLAYER %d HIT PLAYER %d’s SHIP!", playerA, playerB);
      } else {
        playerATarget[x][y] = 'O';
        playerBLocation[x][y] = 'O';
        System.out.printf("PLAYER %d MISSED!\n", playerA);
      }
      printBattleShip(playerATarget);
      break;
    }
  }

  }
  
  
  // Method to prompt user for ship coordinates of length 1
  public static int[][] getCoordinates(Scanner input) {

    int boardSize = 5;
    int numInput = 5;
    int[][] coord = new int[numInput][2];
    
    // initialize coordinates to negative value since (0,0) should be a valid coordinate
    for (int i = 0; i < numInput; i ++) {
      coord[i][0] = -1;
      coord[i][1] = -1;
    }
    
    for (int i = 0; i < numInput; i ++) {
    
      while (true) {
        System.out.printf("Enter ship %d location:\n", i + 1);
        int x = input.nextInt();
        int y = input.nextInt();

	// Compute bools for validation
        boolean outOfBounds = (x < 0) || (y < 0) || (x > boardSize-1) || (y > boardSize-1); 
        boolean repeatCoord = false;
        for (int j = 0; j < numInput; j++) {
          if ((x == coord[j][0]) && (y == coord[j][1])) {
            repeatCoord = true;
            break;
          }
        }
        
        // Validation
        if (repeatCoord) {
          System.out.printf("You already have a ship there. Choose different coordinates.\n", i);
        }
        if (outOfBounds) {
          System.out.printf("Invalid coordinates. Choose different coordinates.", i);
        }
        if (!repeatCoord & !outOfBounds) {
          coord[i][0] = x;
          coord[i][1] = y;
          break;
        }
      }
      
    }
    return coord;
  }
  
  
  // Create blank grid
  private static char[][] createGrid() {
    int boardSize = 5;
    char[][] board = new char[boardSize][boardSize];
    // initialize board with empty spaces
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++) {
        board[r][c] = '-';
      }
    }
    return board;
  }
  
  
  // Create the user grid/board from input
  private static char[][] createBoard(int[][] playerCoord) {
  
    // initialize empty grid
    char[][] board = createGrid();
    
    // populate with ship location
    for (int i = 0; i < playerCoord.length; i++) {
      int x = playerCoord[i][0];
      int y = playerCoord[i][1];
      board[x][y] = '@';
    }
    return board;
  }
  
    
  // Use this method to print game boards to the console.
  private static void printBattleShip(char[][] player) {
    System.out.print("  ");
    for (int row = -1; row < 5; row++) {
      if (row > -1) {
        System.out.print(row + " ");
      }
      for (int column = 0; column < 5; column++) {
        if (row == -1) {
          System.out.print(column + " ");
        } else {
          System.out.print(player[row][column] + " ");
        }
      }
      System.out.println("");
    }
  }

}
