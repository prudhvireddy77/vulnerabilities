import java.util.Random;
import java.util.Scanner;

public class SystemVulnerabilities {
    public static void main(String[] args) {

        int count = 10004;
        String name = "dud";
        int day = 4;
        Scanner sc = new Scanner(System.in);

        String dayName = new String("Any Day");

        System.out.println("Enter day");
        day = sc.nextInt();

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName =  "Tuesday";
                break;
            case 3:
                dayName =  "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName =  "Friday";
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
        }

        System.out.println(dayName);
    }
    int randomNumberGenerator() {
        Random r = new Random();
        return r.nextInt(20,50);
    }
}
