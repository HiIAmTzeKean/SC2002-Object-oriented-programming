package tutorials.sc2002_tut5;

public class Rectangle extends Polygon {
    public Rectangle(String theName, float theWidth, float theHeight) {
        super(theName,theWidth,theHeight);
        super.setPolytype(KindofPolygon.POLY_RECT);
    }
    public Rectangle(){
        this("r",1,1);
    }
    public float calArea(){
        return 5;
    }
}
