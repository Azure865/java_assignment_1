package Assignment_1.Q1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        double temp = sc.nextDouble();
        double celsius = (temp - 32) * 5 / 9;
        System.out.println("The Celsius is " + celsius);
    }
}
