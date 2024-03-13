package unit5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a variable for m, n, and p to make minesweeper: ");
        int m = in.nextInt();
        int n = in.nextInt();
        int p = in.nextInt();
        boolean[][] theField= doMinesweeper(m,n,p);
        printField(theField);
        printNumberedField(theField);
    }

    public static boolean[][] doMinesweeper(int m, int n, int p) {

        Random rand = new Random();
        boolean[][] board = new boolean[m][n];
        int chance = 0;
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {

                chance = rand.nextInt(0,p);
                if (chance == 0) {
                    board[i][j] = true;
                }
                else{
                    board[i][j] = false;
                }
            }
        }
        return board;

    }

    public static void printField(boolean[][] board) {

        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j]) {
                    System.out.print("*  ");
                }
                else{
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
    }

    public static void printNumberedField(boolean[][] board) {

        String[][] temp = new String[board.length + 2][board[0].length + 2];

        for(int i = 1; i < temp.length - 1; i++) {
            for(int j = 1; j < temp[0].length - 1; j++) {

                if(board[i - 1][j - 1]) {
                    temp[i][j] = "*  ";
                }
                else {
                    temp[i][j] = ".  ";
                }
            }
        }

        String[][] readField = new String[3][3];
        for(int i = 1; i < temp.length - 1; i++){

            for(int j = 1; j < temp[0].length - 1; j++) {

                int bombs = 0;
                if(temp[i][j].equals(".  ")) {
                    for(int k = 0; k < readField.length; k++) {
                        readField[k] = Arrays.copyOfRange(temp[i - 1 + k], j - 1, j + 2);
                    }

                    for (int l = 0; l < readField.length; l++) {
                        for(int o = 0; o < readField.length; o++) {
                            if(readField[l][o] != null && readField[l][o].equals("*  ")) {
                                bombs += 1;
                            }
                        }
                    }
                    temp[i][j] = bombs + "  ";
                }
            }
        }

        for(int i = 1; i < temp.length - 1; i++) {
            for(int j = 1; j < temp[0].length - 1; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
}
