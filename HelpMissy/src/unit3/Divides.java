package unit3;

import java.util.Scanner;

public class Divides {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean divides = a % b == 0 || b % a == 0;

        System.out.println(divides);
    }
}
