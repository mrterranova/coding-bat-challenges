package Sudoku;

public class Board {
    Integer[][] board = new Integer[9][9];

 public Board(String[] sudoku, int min, int max){
     for (int i = min; i < max; i++) {
         for(int j=0; j<9; j++){
             board[i-min][j] = Integer.parseInt(sudoku[i].charAt(j)+"");
         }
     }
 }



}
