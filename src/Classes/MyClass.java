package Classes;

public class MyClass {
    public static void main(String[] args) {
        B b = new C();
        A a = b;

        if (a instanceof A) System.out.println("A");
        if (a instanceof B) System.out.println("B");
        if (a instanceof C) System.out.println("C");
        if (a instanceof D) System.out.println("D");

    }
}
