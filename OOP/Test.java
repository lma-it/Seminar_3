package OOP;

public class Test implements Some{
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
