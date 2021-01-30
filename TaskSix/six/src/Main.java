/*
Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages"
the name of that String variable should be printed.

For example, while creating object if we pass "Java", then "I love Java" should be printed. There can be more than one programming languages.
 */

public class Main {

    public static void main(String[] args) {

        Programming programming1 = new Programming();
        Programming programming2 = new Programming("Tacos");

    }

}

class Programming{

    StringBuilder phrase = new StringBuilder("I love ");

    Programming(){
        setPhrase("Programming");
        printMe();
    }

    Programming(String str){
        setPhrase(str);
        printMe();
    }

    public void setPhrase(String phrase) {
        this.phrase.append(phrase);
    }

    public StringBuilder getPhrase() {
        return phrase;
    }

    public void printMe(){
        System.out.println(phrase);
    }
}
