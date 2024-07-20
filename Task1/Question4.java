package guvi.task1;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers:" );
        long num1 = scan.nextLong();
        long num2 = scan.nextLong();
        long num3 = scan.nextLong();
        long small=Math.min(Math.min(num1,num2),num3);
        System.out.println("Smallest Number:"+small);
    }
}
