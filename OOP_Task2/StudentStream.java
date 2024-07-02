package OOP_Task2;
import java.util.List;
import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.Iterator;

/**
 * Класс {@code StudentStream}, который имплементируется от интерфейса {@link Iterable}
 * 
 * <p>
 * Создает и инициализирует поток, который хранит в себе список с группами студентов.
 * </p>
 */
public class StudentStream implements Iterable<StudentGroup>{

    /**
     * Список для хранения групп студентов
     */
    private List<StudentGroup> studentStream = new ArrayList<>();

    /**
     * Название потока
     */
    private String nameOfStream;

    /**
     * Конструктор потока студентов, который инициализирует список групп студентов.
     * 
     * @param studentGroups - список групп из студентов
     */
    public StudentStream(List<StudentGroup> studentGroups, String nameOfStream) {
        this.studentStream.addAll(studentGroups);
        this.nameOfStream = nameOfStream;
    }

    /**
     * Конструтор потока студентов, который принимает группу студентов и добавляет в список групп
     * 
     * @param studentGroup - список студентов
     */
    public StudentStream(StudentGroup studentGroup, String nameOfStream) {
        this.studentStream.add(studentGroup);
        this.nameOfStream = nameOfStream;
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

    /**
     * Переопределенный метод для корректного отображения в консоль
     */
    @Override
    public String toString() {
        return String.format("\nГрупп в потоке по курсу: %s - %s", getNameOfStream(), getStudentStream());
    }

    /**
     * Геттер позволяет получить размер потока
     * 
     * @return размер потока, а именно - количество групп в потоке
     */
    public int getSize(){
        return this.studentStream.size();
    }

    /**
     * Геттер имени потока
     * 
     * @return - возвращает имя потока
     */
    public String getNameOfStream() {
        return this.nameOfStream;
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
