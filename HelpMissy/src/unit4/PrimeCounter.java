package unit4;


public class PrimeCounter {

    public static void main(String[] args) {




        int count = 0;

        for(int i = 2; i <= 1000000; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        System.out.println("Prime numbers less than or equal to 10,000,000: " + count);
    }

    public static boolean isPrime(int number){

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
