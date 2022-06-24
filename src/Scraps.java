public class Scraps {

    public static void main(String[] args) {
//
//        int count = 3;
//        int b = 7;
//
//            while (b < 30) {
//                count = count + 2;
//                System.out.println(3 * count + b);
//                count ++;
//                b = b * 2;
//            }
//        System.out.println("count = " + count + ", b = " + b);
//
//
//    }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int m = 0; m < i * 2; m++) {
                    if (m == j && m == i) {
                        System.out.println("i: " + i);
                        System.out.println("j: " + j);
                        System.out.println("m: " + m);
                    }
                }
            }
        }
    }
}
// m = 0, i = 0,    0 < 0 * 2  == false