package hw06;

import java.util.Scanner;

//formula a=PI*r*r
public class Program6AreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = s.nextDouble();
        double area = (22 * r *r) / 7;
        System.out.println("Area if circle is: " + area);
    }
}
