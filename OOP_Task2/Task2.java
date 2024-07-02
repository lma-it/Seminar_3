package OOP_Task2;
import static print_module.print_library.println;

// import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * <p>
 * Далее подробно разберем {@code Iterator} и для чего он нужен.
 * </p>
 * <p>
 * Основное его предназначение, это пробежаться по коллекции через цикл {@code while}, именно {@code while}, это очень важный момент.
 * </p>
 * <p>
 * В интерфейсе {@code Iterator} есть 2 метода: 
 * <p>
 *    <ul>
 *         <li>{@code hasNext()} - метод который возвращает {@code true}, если есть следующий элемент в коллекции
 *         <li>{@code next()} - метод который возвращает следуюущий элемент в коллекции.
 *    </ul>
 * </p>
 * <p>
 * Данные методы необходимо переопределить и построить их логику так, как необходимо чтоб перебиралась коллекция
 * </p>
 * 
 * <p>
 * Далее рассмотрим интерфейс {@code Iterable} на примере класса {@link OOP_Task2.StudentGroup StudentGroup}, который мы имплементируем от
 * интерфейса {@code Iterable} и переопределим в нем единственный метод {@link OOP_Task2.StudentGroup#iterator() iterator()}
 * </p>
 */
public class Task2 {
    public static void main(String[] args) {
        println("Hello Task2");

        Student pupil = new Student("Igor", 23);
        Student pupil1 = new Student("Evgeniy", 52);
        Student pupil2 = new Student("Alice", 736);
        Student pupil3 = new Student("Lev", 13);
        Student pupil4 = new Student("Michael", 582);

        StudentGroup sg = new StudentGroup();
        sg.setStudents(List.of(pupil, pupil1, pupil2, pupil3));
        sg.setStudent(pupil4);

        println(sg.getSize());

        // Iterator<Student> iterator = new StudentGroupIterator(sg);
        // StudentGroupIterator iterator = new StudentGroupIterator(sg); // В обоих случаях итерация работает как положено.
        // while(iterator.hasNext()){
        //     println(iterator.next());
        // }

        // Благодаря реализации интерфейса Iterable в классе StudentGroup мы можем без проблем пробегать по нашей коллекции студентов
        // циклом for-each
        for (Student student : sg) {
            println(student);
        }

        
        ArrayList<Student> studentList = new ArrayList<>(List.of(pupil, pupil1, pupil2, pupil3, pupil4));
        println(studentList);

        // Сортировка через пользовательский Comparator
        //Collections.sort(studentList, new StudentComparator());

        // Ниже представлен Comparator через лямбда выражение.
        // Это может работать в данном случае, потому что у Comparator только один абстрактный метод
        Collections.sort(studentList, (o1, o2) -> o1.getId() - o2.getId());

        // Еще один способ записи лямбда выражения
        // Collections.sort(studentList, (o1, o2) -> {return o1.getId() - o2.getId();});

        println(studentList);



    }
}
