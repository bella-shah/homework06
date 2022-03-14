package hw06;

public class Program2Static {

       // Declaring two ststic variables
        static int a = 50;//Static variable
        static int b = 100;// static variable

       //Declare one static method
    public static void test1() {
        System.out.println(a);
        System.out.println(b);

    }
    //declare main method
    public static void main (String [] args){
        // call the static method onto the main method
        test1();



        }
    }


