import java.util.Scanner;

public class Problem4_06_22_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        while(n <= 0) {
            System.out.print("Enter a positive integer: ");
            n = input.nextInt();
        }

        int sum = 0;

        while(n > 0 || sum > 9) {
            if(n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }

}
