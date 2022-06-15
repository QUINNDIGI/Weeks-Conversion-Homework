import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;

        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        System.out.print("Enter c: ");
        c = input.nextInt();
        System.out.print("Enter d: ");
        d = input.nextInt();

        System.out.println("Sum of all integers is: " + sum(a, b, c ,d));
        System.out.println("Multiplication of a, b, and d is: " + multiply(a, b, d));
        System.out.println("Result of dividing b by d is: " + divide(b, d));
        System.out.println("Result of subtracting c from d is: " + subtract(c, b));


    }
    //Sum Method
    public static int sum(int a, int b, int c, int d) {

        int result = a + b + c + d;
        return result;
    }

    //Multiply Method
    public static int multiply(int a, int b, int c) {

        int result = a * b * c;
        return result;
    }

    //Divide Method
    public static double divide(int a, int b) {

        double result = (double) a / b;
        return result;
    }

    //Subtract Method
    public static int subtract(int a, int b){

        int result = b - a;
        return result;
    }

}
