import java.util.Arrays;
import java.util.Scanner;

public class Problem1_06_22_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int n = input.nextInt();

        while (n <= 0) {
            System.out.print("Please enter a positive integer: ");
            n = input.nextInt();
        }

        int[] arr = new int[n];

        System.out.println("Array on one line: ");
        for (int i = 0; i < n; i++){
            arr[i] = (int) (Math.random() * ((500 - 1)) + 1);
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Maximum: " + getMax(arr));
        System.out.println("Minimum: " + getMin(arr));
        System.out.println("Sum: " + sumValues(arr));
        System.out.println("Average: " + getAverage(arr));
        System.out.println("Number of integers greater than average: " + greaterThanAverage(arr));
        System.out.println("Number of times subsequent value increases: " + countInc(arr));
        System.out.println("Number of times subsequent value decreases: " + countDec(arr));
        System.out.println("Array with 3 elements per line: ");
        printArray3PerLn(arr);


    }

        public static int getMax(int[] arr) {
            int max = arr[0];

            for(int i = 0; i < arr.length; i++) {
                if (arr[i] > max){
                    max = arr[i];
                }

            } return max;
        }

        public static int getMin(int[] arr) {
            int min = arr[0];

            for(int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            } return min;
        }

        public static int sumValues(int[] arr) {
            int sum = 0;

            for(int i = 0; i < arr.length; i++) {
                sum += arr[i];
            } return sum;
        }

        public static double getAverage(int[] arr) {
            int sum = 0;
            int avg = 0;

            for(int i = 0; i < arr.length; i++) {
                sum += arr[i];
                avg = sum / arr.length;
            } return avg;
        }
    public static int greaterThanAverage(int[] arr) {
        int sum = 0;
        int avg = 0;
        int gta = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > avg) {
                gta++;
            }
        }
        return gta;
    }

    public static int countInc(int[] arr) {
        int subsequentIncreases = 0;

        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    subsequentIncreases++;
                }
            } return subsequentIncreases;
        }

    public static int countDec(int[] arr) {
        int subsequentDecreases = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                subsequentDecreases++;
            }
        } return subsequentDecreases;
    }

    public static void printArray(int[] arr) {
        System.out.println(arr);
    }

    public static void printArray3PerLn(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            if ((i + 1) % 3 == 0 ) {
                System.out.println();
            }
        }
    }


}
