package test;

public class Student {
    private String name;
    private int roll; //overides from main class

//    public Student(String name, int roll) {
//        this.name = name;
//        this.roll = roll;
//    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setRoll(int roll){
        this.roll=roll;

    }
    public int getRoll() {
        return roll;
    }
}
