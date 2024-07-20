package guvi.task1;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        long num=scan.nextLong();
        if(num>=0){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}
