package guvi.task1;

public class Question3 {
    public static void main(String[] args) {
        int num=876;
        System.out.println("Number=" + num);
        int revNum=0;
        while (num!=0){
            int digit= num%10;
            revNum=revNum*10+digit;
            num=(num/10);
        }
        System.out.println("Reversed Number="+revNum);
    }
}
