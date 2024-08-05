package test;

class Person{
private String name;
private int age;

    public void setName(String name){
    this.name=name;
        }
    public String getName(){
    return name;
        }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void display(){
        System.out.println("Greetings to "+name+"\nAge: "+age);
    }
}

public class Encap {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        p.setName("Ujan");
        p.display();
    }
}
