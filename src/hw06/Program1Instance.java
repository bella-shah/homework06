package hw06;

public class Program1Instance {

// Declaring 2 variable
    int a = 60;
    String name = "Setu Patel";

    public void test(){
   // print statement
   System.out.println(a);
        System.out.println(name);

    }
    //Main method
    public static void main(String[] args) {
        // call  instant method into main method
        Program1Instance obj = new  Program1Instance ();
        obj.test ();
    }
}


