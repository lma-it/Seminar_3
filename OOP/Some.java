package OOP;

import java.io.Serializable;
/**
 * В данном случае мы используем для расширения от интерфейса Serializable слово extends вместо implements, хотя при расширении класса
 * от интерфейса мы обычно пишем implements.
 * 
 * Так же интерфейс не может быть наследован от класса.
 * Например строка {@code public interface Some extends Animal} не будет работать.
 * 
 */
public interface Some extends Serializable{
    Double Pi = 3.141592;


    /**
     * {@code defaul void foo(String argument)}
     * Только в интерфейсе мы можем импользовать ключевое слово {@code default}.
     * Этим самым мы говорим, что данный метод будет иметь уже заранее определенную реализацию и может быть переопределен в классе наследнике.
     * {@link OOP.Some#foo(String argument)} - ссылка на метод из интерфейса
     * {@link OOP.Test#foo(String argument)} - ссылка на переопределенный метод
     */
    default void foo(String argument){
        System.out.printf("Привет, я метод foo() с аргументом \"%s\", и я имею уже заранее опреленную реализацию.", argument);
    }

    /**
     * Так же модификаторы доступа типа public писать не нужно, потому что все методы в интерфейсе являются public.
     * Если объявляется абстрактный метод, то не нужно писать public abstarct потому что все методы, не имеющие реализацию через {@code default}
     * являются {@code public abstract}.
     * @param argument
     * 
     */
    void abstractFoo(String argument);


    
}
