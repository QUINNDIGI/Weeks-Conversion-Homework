public class Scraps {

    public static void main(String[] args) {

        String s = "CBBSBB2BB0BB7-BBFallBB21";

        String [] sp1 = s.split("B");

        for (int i = 0; i < sp1.length; i++) {
            System.out.print(sp1[i]);
        }


    }
}
