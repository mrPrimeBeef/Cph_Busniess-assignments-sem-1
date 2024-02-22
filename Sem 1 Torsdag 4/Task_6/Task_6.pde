/*
ask 6: Draw a chess board using a nested for loop and a double int array.
 In this task you will create an integer array with 2 dimensions, that holds values of 0, 1, 0, 1, etc. The instructions below will help you get started.
 
 6.a Create a double int called board[][] with the length of 8 in both arrays.
 
 6.b In setup() create a double for loop that loops through the board and alternates between assigning the value of 0 and 1 (e.g. board[x][y] = 0;).
 
 Hint
 6.c In draw() create a double for loop that loops through the board and draws a rect for each element with the sideLength of 40 (e.g. rect(x * sideLength, y * sideLength, sideLength, sideLength); )
 
 6.d Before drawing the rect in the previous step, add a fill() statement, that fills with the value of 0 if the board[x][y] == 0 and 255 if the the board[x][y] == 1.
 */

// 6. a

int[][] board = new int[8][8];

int sideLength = 40;

void setup() {
  size(320,320); 
  // 6. b
  for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
      if ((i + j) % 2 == 0) {
        board[i][j] = 0;
      } else {
        board[i][j] = 1;
      }
    }
  }
} // end setup

// 6. d

void draw() {
  for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
      int x = j * sideLength;  
      int y = i * sideLength; 
      
      if (board[i][j] == 0) {
        fill(0);
      } else {
        fill(255);
      }
      
      rect(x, y, sideLength, sideLength);
    }
  }
} // end Draw

//void draw() {
//  for (int i = 0; i < board.length; i++) {
//    for (int j = 0; j < board[i].length; j++) {
//      int x = j * sideLength;  
//      int y = i * sideLength; 
      
//      if (board[i][j] == 0) {
//        fill(0);
//      } else {
//        fill(255);
//      }
      
//      rect(x, y, sideLength, sideLength);
//    }
//  }
//} // end Draw
