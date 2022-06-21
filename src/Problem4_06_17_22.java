import java.util.Scanner;

public class Problem4_06_17_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = input.nextInt();

        int sum = 0;
//        int num = 0;

        for (int i = Math.abs(n); i != 0; i /= 10) {
            sum += i % 10;
        }
        System.out.print("The sum of all digits of " + n + " is: " + sum);


//        while (n > 0) {
//            num = n % 10;
//            sum += num;
//            n /= 10;
//        }
////        n = input.nextInt();
//
//        System.out.print("The sum of all digits of " + n + " is: " + sum);
//
//    }

    }
}
