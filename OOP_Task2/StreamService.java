package OOP_Task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Класс для сортировки потоков
 * 
 * <p>
 * Расширяется от класса {@code StreamComparartor}
 * </p>
 */
public class StreamService extends StreamComparator{

    /**
     * Инициализация вложенного класса Reverse
     */
    public Reverse reverse = new Reverse();

    /**
     * Объявление компаратора, который работает с типом {@code StudentStream}
     */
    private Comparator<StudentStream> compare;

    /**
     * Конструктор в котором происходит инициализация компаратора пользовательским {@link StreamComparator}
     * @param streamComparator - пользовательский Comparator
     */
    public StreamService(StreamComparator streamComparator) {
        this.compare = streamComparator;
    }

    /**
     * Пустой конструктор
     */
    public StreamService() {
    }


    /**
     * Метод сортирует список потоков в порядке возрастания
     * @param studentsStreams - список потоков
     * @return список отсортированный в порядке возрастания
     */
    public List<StudentStream> sort(List<StudentStream> studentsStreams){
        Collections.sort(studentsStreams, this.compare);
        return studentsStreams;
    }

    /**
     * Вложенный класс Reverse в котором всего один метод {@code reverseComparation()}, который позволяет сортировать список потоков в порядке убывания
     */
    public class Reverse {

        public Reverse() {
        }
    
        /**
         * Метод, который позволяет перевернуть сортировку в порядке убывания
         * @return {@code -1}
         */
        private int reverseComparation(){
            return -1;
        }
    }

    

    /**
     * Перегруженый метод sort(), который позволяет сортировать список потоков в порядке убывания с помощью класса {@link Reverse}
     * @param studentsStreams - список потоков студентов
     * @param reverseComporation - метод для обратной сортирвки
     * @return список потоков отсортированный от большего к меньшему
     */
    public List<StudentStream> sort(List<StudentStream> studentsStreams, Reverse reverse){
        Collections.sort(studentsStreams, (o1, o2) -> (o1.getSize() - o2.getSize()) * reverse.reverseComparation());
        return studentsStreams;
    }
    
}
