package OOP_Task1;

import java.io.Serializable;
/**
 * В данном случае для расширения от интерфейса {@linkplain java.io.Serializable Serializable} мы используем ключевое слово {@code extends} вместо {@code implements}, хотя при расширении
 * от интерфейса мы пишем {@code implements}.
 * 
 * ВАЖНО!!! Интерфейс не может быть наследован от класса.
 * Например строка {@code public interface Some extends SomeClass} не будет работать.
 * 
 */
public interface Some extends Serializable{
    Double Pi = 3.141592;


    /**
     * {@code defaul void foo(String argument)}
     * Только в интерфейсе мы можем импользовать ключевое слово {@code default}.
     * Этим самым мы говорим, что данный метод будет иметь уже заранее определенную реализацию и может быть переопределен в классе наследнике.
     * {@link OOP_Task1.Some#foo(String argument)} - ссылка на метод из интерфейса
     * {@link OOP_Task1.Test#foo(String argument)} - ссылка на переопределенный метод
     */
    default void foo(String argument){
        System.out.printf("Привет, я метод foo() с аргументом \"%s\", и я имею уже заранее опреленную реализацию.", argument);
    }

    /**
     * Так же модификаторы доступа типа {@code public} писать не нужно, потому что все методы в интерфейсе являются {@code public}.
     * Если объявляется абстрактный метод, то не нужно писать {@code public abstarct} потому что все методы, не имеющие реализацию через {@code default}
     * являются {@code public abstract}.
     * @param argument
     * 
     */
    void abstractFoo(String argument);


    
}
