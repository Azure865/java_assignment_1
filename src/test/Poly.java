package test;

public class Poly {
    public void display(){
        System.out.println("This is a poly class");
    }
    public void display( int a){ // method overloading
        if (a == 3){
            System.out.println("Input is equal to 3");
        }
    }
}

class main{
    public static void main(String[] args) {
        Poly p = new Poly();
        p.display();
        p.display(3);

    }
}
