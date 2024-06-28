package Assignemnt_2.Q3_Saloon;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Orish", 3); // Premium member
        Customer c2 = new Customer("Ujan", 2);   // Gold member
        Customer c3 = new Customer("Avash", 1);   // Silver member
        Customer c4 = new Customer("Runal", 0);  // Non-member

        Visit visit1 = new Visit(c1, 225, 240);
        Visit visit2 = new Visit(c2, 35, 120);
        Visit visit3 = new Visit(c3, 130, 90);
        Visit visit4 = new Visit(c4, 190, 140);

        System.out.println("Bill for " + c1.getName() + ": Rs." + visit1.getTotalBill());
        System.out.println("Bill for " + c2.getName() + ": Rs." + visit2.getTotalBill());
        System.out.println("Bill for " + c3.getName() + ": Rs." + visit3.getTotalBill());
        System.out.println("Bill for " + c4.getName() + ": Rs." + visit4.getTotalBill());
    }
}
