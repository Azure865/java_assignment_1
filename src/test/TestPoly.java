package test;

class Shape{
    public void draw(){
        System.out.println("draw");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Triangle");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("Square");
    }
}

public class TestPoly {
    public static void main(String[] args) {
        Shape sh;
        sh =new Rectangle();
        sh.draw();
        sh=new Triangle();
        sh.draw();
        sh=new Square();
        sh.draw();
    }
}
