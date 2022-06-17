import java.util.Scanner;

public class Problem2_06_17_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){

            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.print("The sum of all even numbers between 1 and " + n + " is: " + sum);

    }

}
