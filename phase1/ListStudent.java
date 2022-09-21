package practice8.phase1;

import java.util.ArrayList;

public class ListStudent {
    private final ArrayList<Student> listStudent;

    public ListStudent() {
        this.listStudent = new ArrayList<Student>();
    }

    public ListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public void addStudent(Student student) {
        this.listStudent.add(student);
    }

    public void editStudent(int id, String name, String date, String classId, float mathScore, float physicalScore, float chemicalScore) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (id == listStudent.get(id).getId()) {
                listStudent.get(i).setName(name);
                listStudent.get(i).setDate(date);
                listStudent.get(i).setClassId(classId);
                listStudent.get(i).setMathScore(mathScore);
                listStudent.get(i).setPhysicalScore(physicalScore);
                listStudent.get(i).setChemicalScore(chemicalScore);
            }
        }
    }

    public boolean deleteStudent(Student student) {
        return this.listStudent.remove(student);
    }

    public void printStudents() {
        for (Student student : listStudent) {
            if (student.getTotal() == 20 && student.getMathScore() >8) {
                System.out.println(student);
            }
        }
    }
}
