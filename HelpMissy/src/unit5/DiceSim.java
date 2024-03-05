package unit5;

import java.util.Random;

public class DiceSim {

    public static void main(String[] args) {

        int[] frequencies = new int[13];
        for (int i = 1; i <= 6; i++)
            for (int j = 1; j <= 6; j++)
                frequencies[i+j]++;


        double[] probabilities = new double[13];
        for (int k = 1; k <= 12; k++)
            probabilities[k] = frequencies[k] / 36.0;

        for (int r = 0; r < frequencies.length; r++) {
            System.out.print(frequencies[r]);
            if(r != frequencies.length - 1) {
                System.out.print(", ");
            }

        }

        System.out.println();

        for (int t = 0; t < probabilities.length; t++) {
            System.out.printf("%.3f ", probabilities[t]);
            if(t != probabilities.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n");

        Random rand = new Random();
        int[] dice = new int[36];
        for (int d = 0; d < dice.length; d++) {
                dice[d] += rand.nextInt(1,7);
                dice[d] += rand.nextInt(1,7);
        }

        int[] diceFreq = new int[13];

        for(int f = 0; f < dice.length; f++) {
            diceFreq[dice[f]]++;
        }

        double[] diceProb = new double[13];
        for(int p = 0; p < diceProb.length; p++) {
            diceProb[p] = diceFreq[p] / (double)dice.length;
        }

        for(int p = 0; p < diceProb.length; p++) {

           System.out.printf("%.3f ", diceProb[p]);

        }




    }
}
