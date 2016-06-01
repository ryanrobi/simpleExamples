/**
 * Created by Ryan Robison on 6/1/16.
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        int max = 150;

        System.out.println("Generate prime numbers between 1 and " + max);

        for (int i = 1; i < max; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
