import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        students.add(new Student(roll, name, dept, marks));
        System.out.println(" Student added successfully!\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void updateStudent() {
        System.out.print("Enter Roll Number of student to update: ");
        int roll = scanner.nextInt();
        scanner.nextLine();

        for (Student s : students) {
            if (s.getRollNumber() == roll) {
                System.out.print("Enter new Name: ");
                s.setName(scanner.nextLine());
                System.out.print("Enter new Department: ");
                s.setDepartment(scanner.nextLine());
                System.out.print("Enter new Marks: ");
                s.setMarks(scanner.nextDouble());
                System.out.println(" Student updated successfully!\n");
                return;
            }
        }
        System.out.println(" Student not found.\n");
    }

    public void deleteStudent() {
        System.out.print("Enter Roll Number of student to delete: ");
        int roll = scanner.nextInt();

        students.removeIf(s -> s.getRollNumber() == roll);
        System.out.println(" Student deleted successfully!\n");
    }
}
