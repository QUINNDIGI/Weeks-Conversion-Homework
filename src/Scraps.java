public class Scraps {

    public static void main(String[] args) {

        int count = 3;
        int b = 7;

            while (b < 30) {
                count = count + 2;
                System.out.println(3 * count + b);
                count ++;
                b = b * 2;
            }
        System.out.println("count = " + count + ", b = " + b);


    }
}
