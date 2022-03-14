package hw06;

import java.util.Scanner;
public class Program13AverageofThreeNumbers {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = in.nextInt();
        System.out.print("Enter the second number: ");
        int y = in.nextInt();
        System.out.print("Enter the third number: ");
        int z = in.nextInt();
        int a = (x+y+z) / 3;
        System.out.print("The average value is: " + a);
    }


}
