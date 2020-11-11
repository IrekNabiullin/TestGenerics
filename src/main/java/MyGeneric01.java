public class MyGeneric01 {
    public static void main(String[] args) {
        Box00 box1 = new Box00("Строка");
        Box00 box2 = new Box00(10);

        String s = (String) box1.getObj();
        int x = (int) box2.getObj();
        System.out.println(s); // Строка
        System.out.println(x); // 10

        Box00 box = new Box00("Строка");
        box.setObj(15);             // Мы можем менять объект!

        s = "";
        x = 0;
        if (box.getObj() instanceof String) {
            s = (String) box.getObj();
            System.out.println(s);
        } else if (box.getObj().getClass() == Integer.class) {
            x = (int) box.getObj();
            System.out.println(x);
        }
    }
}

class Box00 {
    private Object obj;

    public Box00(Object obj) {
        this.setObj(obj);
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
