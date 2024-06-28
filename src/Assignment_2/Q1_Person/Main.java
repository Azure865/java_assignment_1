package Assignment_2.Q1_Person;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Aman", "123 Main St", "555-1234", "aman@gmail.com", Student.Status.SENIOR);
        Faculty faculty = new Faculty("Sagar", "456 Oak Ave", "555-5678", "sagar@gmail.com",
                "F955", "45000",  "2020/815", "9am-6pm", "Professor");
        FullTime fullTimeStaff = new FullTime("Hari", "789 Elm Blvd", "555-9876", "Hari@gmail.com",
                "S112", "77000",  "2019/310", "Manager");
        PartTime partTimeStaff = new PartTime("Samir", "321 Pine Rd", "555-4321", "Samir@gmail.com",
                "N244", "4500", "2021/6/20", "Assistant",15,7 );

        // Display information using toString methods
        System.out.println(student);
        System.out.println("Status: " + student.getStatus());
        System.out.println();

        System.out.println(faculty);
        System.out.println("Office Hours: " + faculty.getOffice_hours());
        System.out.println("Rank: " + faculty.getRank());
        System.out.println();

        System.out.println(fullTimeStaff);
        System.out.println();

        System.out.println(partTimeStaff);
        partTimeStaff.calculateEarnings(20); // Record hours worked
        System.out.println("Earnings: $" + partTimeStaff.calculateEarnings(20));
    }
}
