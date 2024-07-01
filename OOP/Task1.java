package OOP;
import static print_module.print_library.println;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        println("Hello");

        // Comparable<Long> comparable = new Comparable<Long>() {

        //     @Override
        //     public int compareTo(Long o) {
        //         return 0;
        //     }
            
        // };

        // Comparable<Long> comparable = o -> 0;
        Test test = new Test();
        test.foo("Hello");
        System.out.println();
        test.abstractFoo("Hello");
        println();

        // Ключевое слово final
        // Применяется у классов. Это значит что от этого класса нельзя наследоваться.
        // У методов final означает что метод невозможно переопределить в классах наследниках
        // У списков ключевое слово final ограничивает только тип списка, но его можно изменять.
        final List<Integer> list = new LinkedList<>();
        println("Выводим список сразу после объявления: ");
        println(list);
        list.add(0);
        list.add(10);
        list.add(12);
        println("Выводим список после добавления в него элементов: ");
        println(list);
        list.remove(0);
        println("Выводим список после удаления элемента по индексу 0: ");
        println(list);

        // list = new ArrayList<>(); // В данном случае будет ошибка компиляции, потому что мы пытаемся переопределить список на новый тип списка

        
    }
}