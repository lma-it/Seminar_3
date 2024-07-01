package OOP_Task2;

import java.util.Iterator;

/**
 * <p>
 * В данном классе обязательно необходимо указать конструктор с параметром {@code StudentGroup sg}, в котором мы должны инициализировать класс {@code StudentGroup}
 * переданным параметром {@code sg}, в котором есть заполненный в методе {@code main} список студентов. Просто если мы внутри этого класса создадим новый экземпляр класса {@code StudentGroup}, у которого
 * список студентов будет пустой, то итерация работать не будет
 * </p>
 */
public class StudentGroupIterator implements Iterator<Student>{

    // private StudentGroup sg = new StudentGroup - такой код поломает весь код. Так как у этого sg список студентов пустой
    private StudentGroup sg; // это правильная реализация, потому что мы в конструкторе присваиваем ему готовый (с заполненным списком студентов) экземпляр класса
    int index = 0;

    public StudentGroupIterator(StudentGroup sg) {
        this.sg = sg;
    }

    @Override
    public boolean hasNext() {
        return index < sg.getSize();
    }

    @Override
    public Student next() {
        return sg.getStudent(index++);
    }
    
}
