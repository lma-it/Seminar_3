package OOP_Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий группу студентов.
 * Реализует интерфейс {@link Iterable}, чтобы обеспечить возможность
 * итерации по списку студентов с помощью цикла {@code for-each}.
 * <p>
 * Класс содержит 5 методов и 1 имплементированный метод от интерфейса {@code Iterable}:
 * </p>
 * <p>
 * <ul>
 *    <li>{@code public List<Students> getStudents()} - {@return список всех студентов}
 *    <li>{@code public Student getStudent(int index)} - {@return экземпляр студента по заданному индексу}
 *    <li>{@code public void setStudents(List<Student> students)} - принимает в себя список студентов и добавляет его к существующему.
 *    <li>{@code public void setStudent(Student student)} - принимает экземпляр класса {@code Student} и добавляет его к существующему списку.
 *    <li>{@code public int getSize()} - {@return {@code int n} размер списка студентов}
 * </ul>
 * </p>
 *    <p> Имплементирванный метод: </p>
 * <p>
 * <ul>
 *    <li>{@code public Iterator<Student> iterator()} - {@return {@code new StudentGroupIterator(this)}, 
 *        где {@code this} - это экземпляр класса {@code StudentGroup}, который мы передаем в качестве параметра в конструктор класса 
 *        {@link StudentGroupIterator#StudentGroupIterator(StudentGroup sg) StudentGroupIterator(StudentGroup sg)}}
 * </ul>
 * </p>
 */
public class StudentGroup implements Iterable<Student>{
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return this.students;
    }

    public Student getStudent(int index){
        return this.students.get(index);
    }

    public void setStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public void setStudent(Student student){
        this.students.add(student);
    }

    public int getSize(){
        return this.students.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
    
}
