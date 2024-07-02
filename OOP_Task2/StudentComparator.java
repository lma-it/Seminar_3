package OOP_Task2;
import java.util.Comparator;

/**
 * Пользовательский {@link Comparator}
 * <p>
 * Создали класс {@code StudentComparator}, для сравнения студентов во время сортировки, который имплементирован от интерфейса {@code Copmarator}.
 * </p>
 * <p>
 * Переопределен метод {@code public int compare(Student o1, Student o2)}.
 * </p>
 */
public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
    
}
