/**
 * Created by Ryan Robison on 6/1/16.
 */
public class Palindrome {

    public static void main(String[] args) {
        int max = 10000;

        System.out.println("The following numbers are palindromes: ");

        for (int i = 10; i < max; i++) {
            int numberToCheck = i;
            int numberInReverse = 0;
            int temp = 0;

            while (numberToCheck > 0) {
                temp = numberToCheck % 10;
                numberToCheck = numberToCheck / 10;
                numberInReverse = numberInReverse * 10 + temp;
            }

            if (i == numberInReverse) {
                System.out.print(i + " ");
            }
        }
    }
}
