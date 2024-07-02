package OOP_Task2;
import java.util.Comparator;

/**
 * Класс, который позволяет реализовать сравнение потоков по их размеру, а именно количеству групп в каждом потоке.
 * 
 * <p>
 * Имплементируется от {@link Comparator} и переопределяет метод {@code public int compare(StudentStream o1, StudentStream o2)},
 * который уже позволяет провести сравнение потоков для их последующей сортировки.
 * </p>
 */
public class StreamComparator implements Comparator<StudentStream>{

    @Override
    public int compare(StudentStream o1, StudentStream o2) {
        return o1.getSize() - o2.getSize();
    }
}
