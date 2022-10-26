package tutorials.sc2002_tut5;

public class Triangle extends Polygon {
    public Triangle(String theName, float theWidth, float theHeight) {
        super(theName,theWidth,theHeight);
        super.setPolytype(KindofPolygon.POLY_TRIANG);
    }
    public Triangle(){
        this("t",1,1);
    }
    public float calArea(){
        return 6;
    }
}
