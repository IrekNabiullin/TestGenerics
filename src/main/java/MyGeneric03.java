public class MyGeneric03 {
    public static void main(String[] args) {
        // Создание экземпляра обобщенного класса
        ClassA<Integer> c = new ClassA<Integer>(10);
        System.out.println(c.obj); // 10
    }
}

// обобщенный класс
class ClassA <T> {
    public T obj;

    public ClassA(T obj) {
        this.obj = obj;
    }
}
