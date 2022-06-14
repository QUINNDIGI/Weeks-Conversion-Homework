import java.util.Scanner;

public class Weeks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter number of weeks: ");
        int weeks = input.nextInt();

        int weeksToDays = weeks * 7;
        int weeksToHours = weeks * 168;
        int weeksToMinutes = weeks * 10080;
        int weeksToSeconds = weeks * 604800;

        System.out.println(weeksToDays + " days.");
        System.out.println(weeksToHours + " hours.");
        System.out.println(weeksToMinutes + " minutes.");
        System.out.println(weeksToSeconds + " seconds.");


    }

}
