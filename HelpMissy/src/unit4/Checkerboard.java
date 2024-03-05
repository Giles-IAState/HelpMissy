package unit4;

import java.util.Scanner;

public class Checkerboard {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer to create a checkerboard: ");
        int dim = in.nextInt();

        for(int i = 0; i < dim; i++) {

            for(int j = 0; j < dim; j++) {
                if(i % 2 == 0) {
                    if(j % 2 == 0){
                        System.out.print("*  ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                else if(i % 2 == 1) {
                    if(j % 2 == 0){
                        System.out.print("   ");
                    }
                    else {
                        System.out.print("*  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
