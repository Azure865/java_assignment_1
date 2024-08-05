package test;

public class Enployee {
    public static void main(String[] args) {
        Student a = new Student();
        a.setRoll(12);
        a.setName("ujan");
        System.out.println("Roll is "+a.getRoll());
        System.out.println("Name is "+a.getName());

        a.setName("orish");
        a.setRoll(33);
        System.out.println("\nRoll is "+a.getRoll());
        System.out.println("Name is "+a.getName());
    }
}
