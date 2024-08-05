package test;

public class A {
    int a=12;
    public void ShowClass(){
        System.out.println("This is A ShowClass");
    }
    public void Show(){
        System.out.println("This is A show class");
    }
    public void ShowMethod(int a){
        System.out.println(a-11);
    }
}

class B extends A{
    int a=33;
    public void calc(){
        System.out.println(a);
    }
    @Override
    public void Show(){
//        super.Show();
        System.out.println("This is class B");
//        System.out.println("int a of class A = "+super.a);
    }
}
class C extends B{
    public void Show(){
        System.out.println("This is class C");
    }
}

class Alphabets{
    public static void main(String[] args) {
        A c;
//        B b = new B();
//        b.calc();
//        b.Show();
//        b.ShowClass();
//        b.ShowMethod(99);
        c = new B();
        c.Show();
        c = new C();
        c.Show();
    }
}