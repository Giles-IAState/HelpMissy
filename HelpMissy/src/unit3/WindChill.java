package unit3;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temp in Fahrenheit that is less than |50|");
        double temperature = in.nextDouble();
        System.out.println("Enter the wind speed (<120 or >= 3) in mph");
        double velocity = in.nextDouble();

        double w = 35.74 + (0.6215 * temperature) +
                (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16);

        System.out.print(w);
    }
}
