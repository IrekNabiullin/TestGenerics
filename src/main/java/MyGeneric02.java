public class MyGeneric02 {
    public static void main(String[] args) {
// Создание экземпляра обобщенного  класса Box<T> с заменой обобщенного типа типом String
        Box<String> box = new Box<String>("Строка");
        box.setObj("Строка 2");         // OK
// box.setObj(10);              // Ошибка
        String s = box.getObj();
        System.out.println(s);          // Строка 2

        //  Создание объекта класса Box<T>
        Box<Integer> box2 = new Box<Integer>(20);
// box.setObj("Строка 2");      // Ошибка
        box2.setObj(10);                 // OK
        int x = box2.getObj();
        System.out.println(x);          // 10

    }
}

//Переделка класса Box в обобщенный:
class Box<T> {
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
