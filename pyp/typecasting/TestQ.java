package pyp.typecasting;

public class TestQ {
    public static void main (String args []) {
        X x1 = new Z();
        x1.compare(10,10);
        Y y1 = (Y) x1;
        y1.compare(10,20);
    }
}
