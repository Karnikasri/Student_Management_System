public class Student {
    private int rollNumber;
    private String name;
    private String department;
    private double marks;

    public Student(int rollNumber, String name, String department, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    // Getters and Setters
    public int getRollNumber() { return rollNumber; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber +
               ", Name: " + name +
               ", Department: " + department +
               ", Marks: " + marks;
    }
}
