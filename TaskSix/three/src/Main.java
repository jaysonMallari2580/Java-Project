/*
Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the name should be "Unknown",
otherwise the name should be equal to the String value passed while creating object of Student class. (Hint: Overloading concept)
 */
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Jerry Genes U. Hill");

        student1.printName();
        student2.printName();
    }
}

class Student{
    StringBuilder name;

    Student(){
        this.name = new StringBuilder("Unknown");
    }

    Student(String name ){
        setName(name);
    }

    public void setName(String name){
        this.name = new StringBuilder(name);
    }

    public StringBuilder getName(){
        return name;
    }

    public void printName(){
        System.out.println("The student name is: "+ this.name);
    }
}