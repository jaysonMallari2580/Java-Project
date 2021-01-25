/*
Write a JAVA program that swaps the case of the alphabets of the string,

For eg,  => “heLLo WOrLd” => “HEllO woRlD”.
 */
public class Main {
    public static void main(String[] args) {
        String str = "heLLo WOrLd";
        String str2="";

        for(char ch : str.toCharArray()){
            str2+= Character.isUpperCase(ch)? Character.toLowerCase(ch) : Character.toUpperCase(ch);
        }
        System.out.println("Input : " + str);
        System.out.println("Output : "+ str2);
    }
}
