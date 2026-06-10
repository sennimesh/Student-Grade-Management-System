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

        System.out.println("Student Added Successfully.");
    }

    public static void viewStudents() {

        if(studentList.isEmpty()) {
            System.out.println("No Students Available.");
            return;
        }

        for(Student s : studentList) {
            System.out.println(s);
        }
    }

    public static void searchStudent() {

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        for(Student s : studentList) {
            if(s.getId().equalsIgnoreCase(id)) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void averageMarks() {

        if(studentList.isEmpty()) {
            System.out.println("No Students Available.");
            return;
        }

        double total = 0;

        for(Student s : studentList) {
            total += s.getMarks();
        }

        double average = total / studentList.size();

        System.out.println("Average Marks = " + average);
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Average");
            System.out.println("5. Exit");
            System.out.print("Select Option: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    averageMarks();
                    break;

                case 5:
                    System.out.println("Program Closed.");
                    break;

                default:
                    System.out.println("Invalid Option.");
            }

        } while(choice != 5);
    }
}