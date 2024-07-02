package OOP_Task2;
/**
 * Данный класс имплементтируется от {@link Comparable}.
 * <p>
 * Так же переопределен метод {@code public int compareTo(Student o)}, в котором реализована логика для сравнения студентов по параметру {@code getName().length()}.
 * Сравнение происходит по логике {@code this.getName().length()} - {@code o.getName().length()}.
 * Если при вычитании длины имени {@code o.getName().length()} из длины текущего {@code this} студента, результат будет больше {@code 0}, то студент {@code Student o}
 * помещается вперед, так как длина его имени короче чем у {@code this}. И такая логика проходит по всей коллекции студентов.
 * </p>
 * 
 * 
 */
public class Student implements Comparable<Student>{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Student: %s, ID: %d", getName(), getId());
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {

        // if (this.getName().length() > (o.getName().length()))
        //     return 1;
        // else if (this.getName().length() < (o.getName().length()))
        //     return 0;
        // else
        //     return 0;

        return this.getName().length() - o.getName().length();
    }
}
