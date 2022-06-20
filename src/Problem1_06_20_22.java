import java.util.Scanner;

public class Problem1_06_20_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer between 1 and 20: ");
        int n = input.nextInt();

        if (n >= 1 && n <= 20) {


            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {

                arr[i] = (int) Math.pow(2, i);

                //Just to show what is in the array
                System.out.println(arr[i]);
            }
            }
            else{
                System.out.println("Incorrect number, please rerun program and enter an integer between 1 and 20");
            }

    }
}

