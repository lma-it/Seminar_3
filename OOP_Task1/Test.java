package OOP_Task1;

public class Test extends MyTestClass implements Some{
    public Test() {
    }

    @Override
    public void abstractFoo(String argument) {
        System.out.printf("Возвращаю %s ", argument);
    }

    // @Override
    // public void foo(String argument) {
    //     System.out.printf("Я переопределенный метод foo() c аргументом \"%s\".", argument);
    // }
}
