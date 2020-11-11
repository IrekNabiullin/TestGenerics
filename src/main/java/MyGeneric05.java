public class MyGeneric05 {
    public static void main(String[] args) {
        //Ограничение обобщенного типа классами, производными от класса Number
        ClassAnumber<Integer> c1 = new ClassAnumber<>(10);
        System.out.println(c1.obj); // 10
        ClassAnumber<Double> c2 = new ClassAnumber<>(10.5);
        System.out.println(c2.obj); // 10.5
    }
}

class ClassAnumber <T extends Number> {
    public T obj;

    public ClassAnumber(T obj) {
        this.obj = obj;
    }
}