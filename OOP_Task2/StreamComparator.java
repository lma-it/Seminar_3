package OOP_Task2;
import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup>{

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.getSize() - o2.getSize();
    }
}
