//Question3

import java.util.Arrays;
import java.util.Scanner;
public class WeekDays {
    public static void main(String[] args) {
        String[] weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //System.out.println(days.length);
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the day position from 0 to 6");
        int num= scan.nextInt();
        try{
            System.out.println(weekdays[num]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Day position is outside the range (0-6)");
        }
    }
}


