package pyp.syntax;

public class XYZApp {
    public static void main (String args []) {
        X aa = new Y();
        Z bb = (Z) aa;
        Y cc = bb;
        bb.doA();
        //aa.doC();
        cc.doB();
        //Y cc = bb;
    }
}
