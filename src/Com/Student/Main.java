package Com.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static ArrayList<student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students.add(new student(id, name, marks));
        System.out.println("Student added!");
    }

    private static void viewStudents() {
        System.out.println("\n--- Students List ---");
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        for (student s : students) {
            if (s.getId() == id) {
                sc.nextLine();
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();

                System.out.print("Enter New Marks: ");
                int marks = sc.nextInt();

                s.setName(name);
                s.setMarks(marks);

                System.out.println("Record updated!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        boolean removed = students.removeIf(s -> s.getId() == id);

        if (removed)
            System.out.println("Record deleted!");
        else
            System.out.println("Student not found!");
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
