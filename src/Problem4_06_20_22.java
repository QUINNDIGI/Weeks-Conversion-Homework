import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem4_06_20_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer n greater than 10: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        int temp;

        System.out.println();
        System.out.println("Before swap: ");

        for (int i = 0; i < n; i++) {
            arr[i] = (int) ((Math.random() * (75 - 2)) + 2);

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of elements at indexes 2, 5, 7, and 9 is: " + (arr[2] + arr[5] + arr[7] + arr[9]));

        //Swap elements at index 2 and 6
        temp = arr[2];
        arr[2] = arr[6];
        arr[6] = temp;

        //Swap elements at index 4 and 7
        temp = arr[4];
        arr[4] = arr[7];
        arr[7] = temp;

        System.out.println();
        System.out.println("After swap:");
        for (int i = 0; i < n; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of elements at indexes 2, 5, 7, and 9 is: " + (arr[2] + arr[5] + arr[7] + arr[9]));
            }


        }

