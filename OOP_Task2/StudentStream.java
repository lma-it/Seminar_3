package OOP_Task2;
import java.util.List;
// import java.util.ArrayList;
import java.util.Iterator;

/**
 * Класс {@code StudentStream}, который имплементируется от интерфейса {@link Iterable}
 * 
 * <p>
 * Создает и инициализирует список групп в потоке.
 * </p>
 */
public class StudentStream implements Iterable<StudentGroup>{

    /**
     * Список для хранения списков с группами студентов
     */
    private List<StudentGroup> studentStream;

    /**
     * Конструктор потока студентов, который инициализирует список групп студентов.
     * 
     * @param studentGroups
     */
    public StudentStream(List<StudentGroup> studentGroups) {
        this.studentStream.addAll(studentGroups);
    }

    /**
     * Геттер для возвращения группы студентов
     * @param index - индекс по которому находится группа студентов
     * @return  список типа {@code StudentGroup studentGroup} содержащий в себе группу студентов
     */
    public StudentGroup getStudentGroup(int index) {
        return studentStream.get(index);
    }

    /**
     * Геттер для получения списка, в котором храняться списки групп студентов
     * @return список {@code List<StudentGroup> listOfStudentGroups}
     */
    public List<StudentGroup> getStudentStream(){
        return this.studentStream;
    }

    @Override
    public String toString() {
        return String.format("Группы студентов: %s", getStudentStream());
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        
        Iterator<StudentGroup> it = new Iterator<StudentGroup>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < studentStream.size();
            }

            @Override
            public StudentGroup next() {
                return getStudentGroup(index++);
            }

        };
        return it;
    }

}
