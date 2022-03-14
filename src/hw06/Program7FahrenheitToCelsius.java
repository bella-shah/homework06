package hw06;
//((F-32)*5/9=0°C

import java.util.Scanner;

public class Program7FahrenheitToCelsius {

    public static void main(String[] Strings) {
        float fahrenheit, celsius;
        Scanner s1 = new Scanner(System.in);//create objects of scanner class
        System.out.println("Enter temperature in degree Fahrenheit: ");
        fahrenheit = s1.nextFloat();//reads user input
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in Celsius is: " + celsius);//output based on user input
    }
}
