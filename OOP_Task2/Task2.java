package OOP_Task2;
import static print_module.print_library.println;

// import java.util.Iterator;
import java.util.List;
import java.util.Collections;
// import java.util.Comparator;
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

        /*                                                   РАБОТА НА СЕМИНАРЕ                                                          */
        
        println("Hello Task2");

        // Создание студентов для первой группы (sg)
        Student pupil = new Student("Igor", 23);
        Student pupil1 = new Student("Evgeniy", 52);
        Student pupil2 = new Student("Alice", 736);
        Student pupil3 = new Student("Lev", 13);
        Student pupil4 = new Student("Michael", 582);

        // Создание группы sg
        StudentGroup sg = new StudentGroup();

        // Добавление студентов в группу списком
        sg.setStudents(List.of(pupil, pupil1, pupil2, pupil3));

        // Добавление студента в группу по одному
        sg.setStudent(pupil4);

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

        // Создание списка студентов для сравнивания
        ArrayList<Student> studentList = new ArrayList<>(List.of(pupil, pupil1, pupil2, pupil3, pupil4));
        // печать до использования Collections.sort
        println(studentList);

        // Сортировка через пользовательский Comparator
        //Collections.sort(studentList, new StudentComparator());

        // Ниже представлен Comparator через лямбда выражение.
        // Это может работать в данном случае, потому что у Comparator только один абстрактный метод
        Collections.sort(studentList, (o1, o2) -> o1.getId() - o2.getId());

        // Еще один способ записи лямбда выражения
        // Collections.sort(studentList, (o1, o2) -> {return o1.getId() - o2.getId();});

        // Печать после сортировки
        println(studentList);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*                                                  ДОМАШНЯЯ РАБОТА                                                         */

        // Инициализация студентов для второй группы (sg2)
        Student pupil5 = new Student("Aleksey", 245);
        Student pupil6 = new Student("Vladimir", 2245);
        Student pupil7 = new Student("Petya", 125);
        Student pupil8 = new Student("Vasya", 25);
        Student pupil9 = new Student("Olegoff", 284);
        Student pupil10 = new Student("Nikita", 5859);

        // Создание второй группы (sg2)
        StudentGroup sg2 = new StudentGroup();
        // Добавление всех студентов в группу списком
        sg2.setStudents(List.of(pupil5, pupil6, pupil7, pupil8, pupil9, pupil10));


        // Инициализация студентов для третьей группы (sg3)
        Student pupil11 = new Student("Volodya", 19);
        Student pupil12 = new Student("Alena", 851);
        Student pupil13 = new Student("Svetlana", 970);
        Student pupil14 = new Student("Vitalina", 20);

        // Создание третьей группы (sg3)
        StudentGroup sg3 = new StudentGroup();
        // Добавление всех студентов в группу списком
        sg3.setStudents(List.of(pupil11, pupil12, pupil13, pupil14));

        // Создание потоков названием потока и добавление групп студентов в потоки
        StudentStream streamProgrammers = new StudentStream(List.of(sg, sg2), "Программист");
        StudentStream streamTesters = new StudentStream(sg3, "Тестировкик");

        // Создать список всех потоков для дальнейшей их сортировки
        List<StudentStream> streams = new ArrayList<>();
        // Добавление потоков с группами в список потоков
        streams.addAll(List.of(streamProgrammers, streamTesters));
        
        println();
        println("Печать потоков до сортировки: ");
        println(streams);

        // Создание экземпляра класса StreamServise м вызов у него метода sort() для сортировки списка потоков
        StreamService streamService = new StreamService(new StreamComparator());
        // Сортировака потоков в порядке возрастания пользовательским методом sort из класса StreamService
        // streamService.sort(streams);
        // println();
        // println("Печать потоков после сортировки в порядке возрастания: ");
        // println(streams);

        // Сортировака потоков в порядке убывания пользовательским методом sort из класса StreamService
        streamService.sort(streams, streamService.reverse);
        println();
        println("Печать потоков после сортировки в порядке убывания: ");
        println(streams);

        // Сортировака потоков в порядке возрастания с помощью Collections и пользовательского StreamComparator
        // Collections.sort(streams, new StreamComparator());
        // println();
        // println("Печать потоков после сортировки: ");
        // println(streams);

        println("\nПечать групп студентов, из потока streamProgrammers, через цикл for-each после реализации интерфейса Iterable в классе StudentStream: ");
        for (StudentGroup studentGroup : streamProgrammers) {
            println(studentGroup);
        }




    }
}
