import java.util.Scanner;

public class June17_2022 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer x: ");

        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {

            if (i % 3 == 0 && i % 2 == 1) {
                System.out.println(i + " is a multiple of 3");
            }

        }



    }

}
