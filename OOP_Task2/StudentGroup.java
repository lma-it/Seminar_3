package OOP_Task2;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return this.students;
    }

    public Student getStudent(int index){
        return this.students.get(index);
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setStudent(Student student){
        this.students.add(student);
    }

    public int getSize(){
        return this.students.size();
    }
}
