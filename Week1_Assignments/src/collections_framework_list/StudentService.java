package collections_framework_list;

import java.util.ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void startApp() {

        System.out.println("How many students?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Mail ID:");
            String mail = sc.nextLine();

            students.add(new Student(id, name, mail));
        }

        menu();
    }

    public void menu() {

        int choice;

        do {

            System.out.println("\n------ STUDENT CRUD MENU ------");
            System.out.println("1 Create");
            System.out.println("2 Read");
            System.out.println("3 Update");
            System.out.println("4 Delete");
            System.out.println("5 Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    createStudent();
                    break;

                case 2:
                    readStudents();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }

    private void createStudent() {

        System.out.println("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Mail ID:");
        String mail = sc.nextLine();

        students.add(new Student(id, name, mail));

        System.out.println("Student added successfully.");
    }

    private void readStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    private void updateStudent() {

        System.out.println("Enter ID to update:");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {

            if (s.getId() == id) {

                System.out.println("Enter new name:");
                String name = sc.nextLine();

                System.out.println("Enter new mail:");
                String mail = sc.nextLine();

                s.setName(name);
                s.setMailId(mail);

                System.out.println("Student updated.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    private void deleteStudent() {

        System.out.println("Enter ID to delete:");
        int id = sc.nextInt();

        for (Student s : students) {

            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}


	