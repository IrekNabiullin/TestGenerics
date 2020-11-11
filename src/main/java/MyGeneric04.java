public class MyGeneric04 {
    public static void main(String[] args) {
        // Указание при объявлении класса нескольких обобщенных типов
        ClassB<Integer, Double> c =
                new ClassB<Integer, Double>(10, 1.5, 45.9, 8);
        System.out.println(c.obj1); // 10
        System.out.println(c.obj2); // 1.5
        System.out.println(c.obj3); // 45.9
        System.out.println(c.x);    // 8
    }
}

class ClassB<T1, T2> {
    public T1 obj1;
    public T2 obj2;
    public T2 obj3;
    int x;

    public ClassB(T1 obj1, T2 obj2, T2 obj3, int x) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
        this.x = x;
    }
}