//Question2

import java.util.Scanner;
public class Voter{
    static int voterId;
    static String name;
    static int age;

    public Voter(int voterId,String name,int age)throws CheckedException{
        this.voterId=voterId;
        this.name=name;
        this.age=age;

        if(age<18){
            throw new CheckedException("Invalid age for Voter");
        }
    }

    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Voter ID:");
        voterId=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter a Name:");
        name=scan.nextLine();
        System.out.println("Enter a Age:");
        age=scan.nextInt();

        try {
            Voter voter = new Voter(voterId,name,age);
            System.out.println("Eligible to Vote");
        }catch (CheckedException e){
            System.out.println("Error:"+e.getMessage());
        }

    }
}
class CheckedException extends Exception{
    public CheckedException(String message){
        super(message);
    }

}
class NameNotValidException extends Exception{
    public NameNotValidException(String message){
        super(message);
    }
}



