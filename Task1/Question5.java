package guvi.task1;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the price:");
        int price = scan.nextInt();
        if(price<500){
            System.out.println("No discount");
            System.out.println("Payable amount:"+price);
        }
        else if (price>=500 && price<=1000) {
            System.out.println("10% discount is applied");
            price= (int) (price-(price*0.1));
            System.out.println("Payable amount:"+price);
        }
        else {
            System.out.println("20% discount is applied");
            price= (int) (price-(price*0.2));
            System.out.println("Payable amount:"+price);
        }
    }
}
