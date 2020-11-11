public class MyGeneric09 {
    //Маски типов
    public static void main(String[] args) {
        Box<Integer> obj1 = new Box<Integer>(10);
        Box<Double> obj2 = new Box<Double>(5.6);
        MyGeneric09.print1(obj1);           // 10
        // Можно только Box<Integer>
        // MyClass.print1(obj2);
        MyGeneric09.print2(obj1);           // 10
        MyGeneric09.print2(obj2);           // 5.6
        MyGeneric09.print3(obj1);           // 10.0
        MyGeneric09.print3(obj2);           // 5.6
        MyGeneric09.print4(obj1);           // 10.0
        MyGeneric09.print4(obj2);           // 5.6
        MyGeneric09.print5(obj1);           // 10
        // Можно только Box<Integer> и Box<Number>
        // MyClass.print5(obj2);
        Box<Number> obj3 = new Box<Number>(5.6);
        MyGeneric09.print5(obj3);           // 5.6
    }

    public static void print1(Box<Integer> obj) {
        System.out.println(obj.getObj().intValue());
    }

    // Любые типы
    public static void print2(Box<?> obj) {
        System.out.println(obj.getObj().toString());
    }

    // Класс Number и производные классы
    public static void print3(Box<? extends Number> obj) {
        System.out.println(obj.getObj().doubleValue());
        // Тип не знаем
        // obj.setObj(obj.getObj()); // Ошибка
    }

    // Класс Number и производные классы
    public static <T extends Number> void print4(Box<T> obj) {
        System.out.println(obj.getObj().doubleValue());
        // Дополнительно знаем тип T
        obj.setObj(obj.getObj());     // OK
    }

    // Класс Integer и базовые классы (Number и Object)
    public static void print5(Box<? super Integer> obj) {
        System.out.println(obj.getObj().toString());
    }


    static class Box<T> {
        private T obj;

        public Box(T obj) {
            this.setObj(obj);
        }

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }
    }
}
