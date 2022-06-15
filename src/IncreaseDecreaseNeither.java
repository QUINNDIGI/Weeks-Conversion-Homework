import java.util.Scanner;

public class IncreaseDecreaseNeither {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.println("Enter x: ");
        x = input.nextDouble();

        System.out.println("Enter y: ");
        y = input.nextDouble();

        System.out.println("Enter z: ");
        z = input.nextDouble();

        if (x < y && x < z && y < z) {
            System.out.println("INCREASING");

        } else if (x > y && x > z && y > z) {
            System.out.println("DECREASING");

        } else {
            System.out.println("NEITHER");
        }

    }

}
