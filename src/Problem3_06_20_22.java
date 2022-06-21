public class Problem3_06_20_22 {

    public static void main(String[] args) {

        int[] arr = {2, 3, 9, 17, 32, 40, 73, 40, 21, 10};
        int temp;
        int n = 1;

        System.out.println("Before shifting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("After shifting: ");

        for (int i = 0; i < n; i++) {
            int a;
            int first;

            first = arr[0];

            for (a = 0; a < arr.length - 1; a++) {
                arr[a] = arr [a + 1];
            }
            arr[a] = first;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        }
    }









