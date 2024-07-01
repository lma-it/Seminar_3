package OOP_Task2;
import static print_module.print_library.println;

import java.util.Iterator;
import java.util.List;

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
 */
public class Task2 {
    public static void main(String[] args) {
        println("Hello Task2");

        Student pupil = new Student("Igor");
        Student pupil1 = new Student("Lora");
        Student pupil2 = new Student("Alice");
        Student pupil3 = new Student("Lev");

        StudentGroup sg = new StudentGroup();
        sg.setStudents(List.of(pupil, pupil1, pupil2, pupil3));

        println(sg.getSize());

        Iterator<Student> iterator = new StudentGroupIterator(sg);
        while(iterator.hasNext()){
            println(iterator.next().toString());
        }



    }
}
