public class MyGeneric06 {
    // Ограничение обобщенного типа двумя интерфейсами
    public static void main(String[] args) {
        ClassA2<A1> c = new ClassA2<A1>(new A1());
        c.test();
    }
}

interface ITest1 {
    void test1();
}

interface ITest2 {
    void test2();
}

class A1 implements ITest1, ITest2 {
    @Override
    public void test1() {
        System.out.println("test1()");
    }

    @Override
    public void test2() {
        System.out.println("test2()");
    }
}

class ClassA2<T extends ITest1 & ITest2> {
    public T obj;

    public ClassA2(T obj) {
        this.obj = obj;
    }

    public void test() {
        this.obj.test1();
        this.obj.test2();
    }
}
