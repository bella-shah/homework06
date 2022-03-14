package hw06;

public class Program4TwoStaticandTwoInstance {

  // Declared two insatance and declared two Static
    int a = 100; // instance variable/global
    String name = "Setu";//Instance variable
    static int b = 200;//static variable
    static int c = 60;//static variable

    // Declared instance method
    public void test() {
        //instance area
        System.out.println(a);//100
        System.out.println(name);//Setu
        System.out.println(b);//200
        System.out.println(c);//60
    }

    //static method
    public static void test1() {
        Program4TwoStaticandTwoInstance obj = new Program4TwoStaticandTwoInstance();//by object
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(b);
        System.out.println(c);
    }

    //main method is a static method
    public static void main(String[] args) {

        Program4TwoStaticandTwoInstance obj = new Program4TwoStaticandTwoInstance();// obj is the object name
        obj.test();//100,
        System.out.println("------");
        test1();//200,60


    }

}

