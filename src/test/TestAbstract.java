package test;

abstract class car{

    public abstract void drive();
    public abstract void fly();

    public void passenger(){
        System.out.println(" Car has passengers...");
    }
}

class Bmw extends car{


    public void drive(){
        System.out.println(" BMW is driving...");
    }

    public void fly() {
        System.out.println(" BMW is flying...");
    }

    public void color(){
        System.out.println(" Black BMW");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.drive();
        bmw.passenger();
        bmw.color();
        bmw.fly();
    }
}
