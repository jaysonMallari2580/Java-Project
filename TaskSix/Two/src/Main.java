/*
Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:

Name        Year of joining        Address

Robert            1994                64C- Walls Streat

Sam                2000                68D- Walls Streat

John                1999                26B- Walls Streat
 */

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Robert","1994","100,000","64C- Walls Streat");
        Employee e2 = new Employee("Sam","2000","80,000","68D- Walls Streat");
        Employee e3 = new Employee("John","1999","95,000","26B- Walls Streat");

       String line = new String(new char[63]).replace('\0','-');

        System.out.println(line);
        System.out.printf("| %-10s | %-10s | %-20s | %-10s |%n",
                "Name", "Year","Address","Salary");

        System.out.println(line);

        e1.printEmployee();
        e2.printEmployee();
        e3.printEmployee();
    }

}

class Employee{
    private String name;
    private String year;
    private String salary;
    private String address;

    Employee(){

    }

    Employee(String name, String year, String salary, String address){
            setName(name);
            setYear(year);
            setSalary(salary);
            setAddress(address);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYear(String year){
        this.year = year;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getDate(){
        return year;
    }

    public String getSalary(){
        return salary;
    }

    public String getAddress(){
        return address;
    }

    public void printEmployee(){
        System.out.printf( "| %-10s | %-10s | %-20s | %-10s | %n",
                getName(), getDate(), getAddress(), getSalary());
    }
}