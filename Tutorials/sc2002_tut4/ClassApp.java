package sc2002_tut4;

public class ClassApp {
    public static void main(String arg []) {
        ClassA a = new ClassF();
        ClassG g = (ClassG) a;
        g.print(88, "there");
    }
}
