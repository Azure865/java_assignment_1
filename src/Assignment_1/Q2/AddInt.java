package Assignment_1.Q2;

import java.util.Scanner;

public class AddInt
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number between 0-1000:");
        int a = sc.nextInt();
        if (a < 0 || a > 1000) {
            System.out.println("Input Invalid");
        }
        int sum = 0;
        int total = a;

        while (a > 0) {
            int b = a % 10;
            sum += b;
            a = a / 10;
        }
        System.out.println("The Sum of "+ total + " : " + sum);
    }
}
