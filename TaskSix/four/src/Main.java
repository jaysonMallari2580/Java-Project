/*
Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is 'length*breadth'.
The class has three constructors which are :

1 - having no parameter - values of both length and breadth are assigned zero.

2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.

3 - having one number as parameter - both length and breadth are assigned that number.

Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
 */
public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(23,45);
        Rectangle rectangle3 = new Rectangle(33);

    }
}

class Rectangle{
    double length;
    double breadth;
    double area;

    Rectangle(){
        setLength(0);
        setBreadth(0);
        setArea(0,0);
        printMe();
    }

    Rectangle(double length, double breadth){
         setLength(length);
         setBreadth(breadth);
         setArea(length,breadth);
         printMe();
    }

    Rectangle(double num){
        setLength(num);
        setBreadth(num);
        setArea(num,num);
        printMe();
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setArea(double num1,double num2) {
        this.area = num1 * num2;
    }

    public double getArea() {
        return area;
    }

    public void printMe(){
        System.out.println("Length: " + length + "\nBreadth: "+breadth + "\nTotal Area: "+ area);
    }
}