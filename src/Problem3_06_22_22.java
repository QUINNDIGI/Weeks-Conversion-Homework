import java.util.Scanner;

public class Problem3_06_22_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an odd integer that is greater than or equal to 5: ");
        int n = input.nextInt();

        while (n < 5 || n % 2 == 0) {
            System.out.print("Please enter an odd integer that is greater than or equal to 5: ");
            n = input.nextInt();
        }
        boxWithMinorDiagonal(n);

    }

    public static void boxWithMinorDiagonal(int n) {

        for(int i = 0; i < n; i++) {
            if(i > 0 ) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("+");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }

}
