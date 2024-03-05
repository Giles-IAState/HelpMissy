package unit6;

import java.util.Random;

public class PrintBoolean {

    public static void main(String[] args) {

        boolean[][] array = new boolean[8][8];
        Random rand = new Random();
        int value;

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                value = rand.nextInt(2);
                if(value == 0) {
                    array[i][j] = false;
                }
                else if(value == 1) {
                    array[i][j] = true;
                }
            }
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if (array[i][j]) {
                    System.out.print("*  ");
                }
                else if (!array[i][j]) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
