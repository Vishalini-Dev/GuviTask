//Question 1

package guvi.task2;
public class Person {
    static String name;
    static int age=18;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println("Person Name: "+ name );
        System.out.println("Person age: "+ age);
    }

    public static void main(String[] args) {
        Person person=new Person("john",age);
        person.display();

    }
}
