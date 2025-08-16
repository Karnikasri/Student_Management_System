import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> sms.addStudent();
                case 2 -> sms.viewStudents();
                case 3 -> sms.updateStudent();
                case 4 -> sms.deleteStudent();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");

            }
        }
    }
}
