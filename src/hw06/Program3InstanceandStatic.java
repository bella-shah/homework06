package hw06;

public class Program3InstanceandStatic {
  // Declared one instance and one static method
    int a = 80;
    static int b = 200;


   // Declared instant method
    public void test() {
        System.out.println(a);//80
        System.out.println(b);//200
    }
    // Declared Static method
    public static void test1(){
        Program3InstanceandStatic obj = new Program3InstanceandStatic();
        System.out.println(obj.a);//80
        System.out.println(b);//200
    }

    public static void main(String[] args) {
        Program3InstanceandStatic obj = new Program3InstanceandStatic();
        obj.test();
        System.out.println("------");
        test1();
    }
}



