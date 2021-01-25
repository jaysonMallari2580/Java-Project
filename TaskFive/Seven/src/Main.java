import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/*
Write a JAVA program that gives boolean values; true, if the string has balanced braces and false, if the string has unbalanced braces:

For eg,  => “5 co” //output => true

//valid parenthesis

{{(  [ ) ] }}  => “[})(” //output => false.
 */
public class Main {

    public static void main(String[] args) {
        String str = "{{(  [ ) ] }}  => “[})("; //false
        String str1 = "[{}]"; // true

        System.out.println(isBalance(str));
        System.out.println(isBalance(str1));


    }

    private static boolean isBalance(String str) {
        Stack<Character> stack  = new Stack<Character>();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
