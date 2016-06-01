import java.util.Scanner;

/**
 * Created by Ryan Robison on 6/1/16.
 */
public class FindHypotenuse {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the height: ");
        double height = reader.nextFloat();
        System.out.println("Enter the base: ");
        double base = reader.nextFloat();

        System.out.println("The hypotenuse of the triangle is: " + calculateHypotenuse(height, base));
    }

    private static double calculateHypotenuse(double height, double base){
        return Math.sqrt(Math.pow(height,2) + (Math.pow(base,2)));
    }
}
