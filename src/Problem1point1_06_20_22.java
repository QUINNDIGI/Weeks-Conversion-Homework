import java.util.Scanner;

public class Problem1point1_06_20_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int n = input.nextInt();

        int arr[] = new int[n];
        double average = 0.0;
        double total = 0.0;




        System.out.print("Please enter " + n + " positive integer(s): ");


        for (int i = 0; i < arr.length; i++) {
            int nIntegers = input.nextInt();
            arr[i] = nIntegers;
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        //Max
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

        }
        System.out.println("Maximum value: " + max);

        //Min
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

        }
        System.out.println("Minimum value: " + min);


        //Avg
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        average = total / n;
        System.out.println("Average: " + average);

        //Elements Greater Than Avg
        System.out.println("Elements greater than average: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.print(arr[i] + " ");
            }
        }

        //Elements greater than last element
        System.out.println();
        System.out.println("Elements greater than " + (arr[arr.length - 1]) + ":");
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[arr.length - 1]);
                System.out.print(arr[i] + " ");
            }
        }
    }


