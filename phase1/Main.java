package practice8.phase1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListStudent listStudent = new ListStudent();
        int choose = 0;
        do{
            System.out.println(
                    """
                            1. Add student.\s
                            2. Edit student.\s
                            3. Delete student.\s
                            4. Show students if math score > 8 and total = 20.\s
                            0. Exit the program.\s
                            """);
            System.out.print("Enter your choice:  ");
            choose = sc.nextInt();

            if (choose == 1) {
                System.out.print("Input id: ");
                int id = sc.nextInt();
                System.out.print("input full name: ");
                String name = sc.next();
                System.out.print("Input birthday: ");
                String date = sc.next();
                System.out.print("Input class's id: ");
                String classId = sc.next();
                System.out.print("Input math score: ");
                float mathScore = sc.nextFloat();
                System.out.print("Input physical score: ");
                float physicalScore = sc.nextFloat();
                System.out.print("Input chemical score: ");
                float chemicalScore = sc.nextFloat();
                Student student = new Student(id, name, date, classId, mathScore, physicalScore, chemicalScore);
                listStudent.addStudent(student);
            } else if (choose == 2) {
                System.out.print("Input student's id to update: ");
                int id = sc.nextInt();
                System.out.print("Input student' name to update: ");
                String name = sc.next();
                System.out.print("Input student' birthday to update: ");
                String date = sc.next();
                System.out.print("Input student's class id to update: ");
                String classId = sc.next();
                System.out.print("Input student's math score to update: ");
                float mathScore = sc.nextFloat();
                System.out.print("Input student's physical score to update: ");
                float physicalScore = sc.nextFloat();
                System.out.print("Input student's chemical score to update: ");
                float chemicalScore = sc.nextFloat();
                listStudent.editStudent(id,name, date, classId, mathScore, physicalScore, chemicalScore);
            } else if (choose == 3) {
                System.out.print("Input student's id: ");
                int id = sc.nextInt();
                Student student = new Student(id);
                System.out.println("Delete student: " + listStudent.deleteStudent(student));
            } else if (choose == 4) {
                listStudent.printStudents();
            }
        } while (choose != 0);
    }
}
