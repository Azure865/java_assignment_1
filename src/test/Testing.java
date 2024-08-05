package test;

import java.util.Scanner;

class Testing {
    int roll;
    String name;

    void update(int a, String b){
        roll = a;
        name = b;
    }
    void display(){
        System.out.println(roll +" "+name);
    }
}