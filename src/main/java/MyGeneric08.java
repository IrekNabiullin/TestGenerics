public class MyGeneric08 {
    //Обобщенные методы
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.<Integer>print(10);
        obj1.print(10);

        B<Integer> obj2 = new B<Integer>(50);
        obj2.<String>print(10, "строка");
        obj2.print(10, "строка");
    }

    static class A {
        // Обобщенный метод внутри обычного класса
        public <T> void print(T obj) {
            System.out.println(obj.toString());
        }
    }

    static class B<T> {
        private T obj;

        // Обобщенный тип в параметре конструктора
        public B(T obj) {
            this.obj = obj;
        }

        // Дополнительный обобщенный тип
        public <U> void print(T obj1, U obj2) {
            System.out.println(obj1.toString());
            System.out.println(obj2.toString());
            System.out.println(this.obj.toString());
        }
    }
}
