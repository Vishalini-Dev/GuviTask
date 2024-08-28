//Question5

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class IntegerStack {
    //create stack
    private Stack<Integer> stack;
    //constructor
    public IntegerStack() {
        stack = new Stack<>();
    }
    
    public void push(int element) {
        //add element on stack 
        stack.push(element);
    }
    
    public int pop() {
        //check stack is not empty
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            throw new RuntimeException("Stack is empty, cannot pop an element.");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //object creation
        IntegerStack integerStack = new IntegerStack();
        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("Enter the element to push or 'exit' to stop pushing:");
            String input=scan.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            else{
                try {
                    //add element on stack using push method
                    int element=Integer.parseInt(input);
                    integerStack.push(element);
                    System.out.println("Pushed element:"+element);
                }catch (NumberFormatException e){
                    System.out.println("Invalid input.Please enter a valid input");
                }
            }

        }
        boolean isPop = true;
        while (isPop && !integerStack.isEmpty()){
            System.out.println("Do you want to pop the element? (yes/no)");
            String input=scan.nextLine();
            if(input.equalsIgnoreCase("yes")){
                //remove the element on stack using pop method
                System.out.println("Popped element: " + integerStack.pop());
            } else if (input.equalsIgnoreCase("no")) {
                break;
            }else {
                System.out.println("Invalid input.Please enter yes or no");
            }
        }

        System.out.println("Is stack empty? " + integerStack.isEmpty());
    }

    public static class StudentGrades {
        //create hash map
        private HashMap<String,Integer> grades;
        //create constructor
        public StudentGrades(){
            this.grades=new HashMap<>();
        }
        // add elements on hash map
        public void addStudent(String name,int grade){
            grades.put(name,grade);
        }
        // 
        public void removeStudent(String name) {
            grades.remove(name);
        }

        public Integer getGrade(String name) {
            return grades.get(name);
        }

        public void display(){
            for (String name:grades.keySet()){
                System.out.println("Student:"+name+",Grade:"+grades.get(name));
            }
        }

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            StudentGrades studentGrades=new StudentGrades();
           while (true){
               System.out.println("Enter a name or 'exit' to finish adding:");
               String name=scan.nextLine();

               if(name.equalsIgnoreCase("exit")){
                   break;
               }
               System.out.println("Enter a grade:");
               int grade=scan.nextInt();
               scan.nextLine();

               studentGrades.addStudent(name,grade);
           }
           System.out.println("Would you want to remove a student? (yes/no)");
           String response=scan.nextLine();
           if(response.equalsIgnoreCase("yes")){
               System.out.println("Enter a student name to remove");
               String name=scan.nextLine();
               studentGrades.removeStudent(name);
           }
           studentGrades.display();
        }


    }
}

