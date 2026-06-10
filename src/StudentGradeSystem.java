import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeSystem {

    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {

        System.out.print("Student ID: ");
        String id = sc.nextLine();

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        System.out.print("Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();

        studentList.add(new Student(id, name, marks));

        System.out.println("Record Added.");
    }

    public static void viewStudents() {

        if(studentList.isEmpty()) {
            System.out.println("No records available.");
            return;
        }

        for(Student s : studentList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Student Grade Management System");

        addStudent();
        viewStudents();
    }
}