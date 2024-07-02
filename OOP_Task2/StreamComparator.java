package OOP_Task2;
import java.util.Comparator;

public class StreamComparator implements Comparator<StudentStream>{

    @Override
    public int compare(StudentStream o1, StudentStream o2) {
        return o1.getSize() - o2.getSize();
    }
}
