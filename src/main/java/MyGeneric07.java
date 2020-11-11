public class MyGeneric07 {
    //Статические обобщенные методы
    public static void main(String[] args) {
        MyGeneric07.<Integer>print(10);
        MyGeneric07.<String>print("Строка");
        MyGeneric07.print(10);
        MyGeneric07.print("Строка");
        A3 obj = new A3();
        MyGeneric07.<A3>echo(obj);
        MyGeneric07.echo(obj);
    }

    public static <T> void print(T obj) {
        System.out.println(obj.toString());
    }

    // Ограничение интерфейсом ITest
    public static <T extends ITest> void echo(T obj) {
        obj.print(); // Вызов метода из интерфейса
    }
}

interface ITest {
    void print();
}

class A3 implements ITest {
    private int x = 20;

    @Override
    public void print() {
        System.out.println("x = " + this.x);
    }
}

