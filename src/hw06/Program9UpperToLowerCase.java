package hw06;

import java.util.Scanner;

public class Program9UpperToLowerCase {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);//object creation of scanner class
        System.out.println("Enter text in the upper case");
        String s1 = obj1.nextLine();// reads user input
        String s2 = s1.toLowerCase();//converts user input to lower case
        System.out.println("Output Conversion to LowerCase: \n" + s2);//output in lower case as per user input
    }
}