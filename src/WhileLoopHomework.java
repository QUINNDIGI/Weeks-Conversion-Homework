import java.util.Scanner;

public class WhileLoopHomework {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Enter an integer n greater than 1: ");
        n = input.nextInt();

        int count = 1;
        int sum = 0;

        while (count <= n) {

            if (n % count == 0) {
                sum += count;
            }
            count++;
        }
        System.out.println("The sum of all factors of " + n + " is " + sum);
    }

}
