package guvi.task1;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value" );
        int i=scan.nextInt();
        if(i==10){
            while (i<=50){
                System.out.print(i);
                i++;
                System.out.print('\t');
            }
        }

    }
}
