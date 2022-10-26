#include <iostream>

using namespace std;

enum KindOfPolygon { POLY_PLAIN, POLY_RECT, POLY_TRIANG };
class Polygon {
    public:
        Polygon(string theName, float theWidth, float theHeight): name(theName),width(theWidth),height(theHeight) {
            polytype = POLY_PLAIN;
        }
        KindOfPolygon getPolytype() {
            return polytype;
        }
        void setPolytype(KindOfPolygon type) {
            polytype = type;
        }
        string getName() { return this->name; }
        virtual float calArea() { return 0; }
        void printWidthHeight() {
            cout<<"Width = "<<width<<" Height = "<<height<<endl;
        }
    protected:
        string name;
        float width;
        float height;
        KindOfPolygon polytype;
};

class Rectangle: public Polygon {
    public:
        Rectangle(string name, float width, float height):Polygon(name,width,height) {
            polytype = POLY_RECT;
        }
        float calArea() { return width*height; }
};

class Triangle: public Polygon {
    public:
        Triangle(string name, float width, float height):Polygon(name,width,height) {
            polytype = POLY_TRIANG;
        }
        float calArea() { return 0.5*width*height; }
};

void printArea(Polygon p) {
    cout<<"The Area is "<<p.calArea()<<endl;
};
void printAreaV2(Polygon *p) {
    cout<<"The Area is "<<p->calArea()<<endl;
};

int main() {
    Polygon p("pol",5.5,5.5);
    Rectangle r("rec",5.5,5.5);
    Triangle t("rec",5.5,5.5);
    Polygon &aliasRect = r;
    Polygon &aliasTri = t;

    // We expect to see all zero here because the function was declared to take in
    // Polygon and we are not passing by alias or ptr
    cout<<"Testing with passing by normal object on stack"<<endl;
    printArea(p);
    printArea(r);
    printArea(t);
    cout<<endl;

    // We expect to see that printArea will still output 0
    // This is because obj is still upcasted to polygon
    // Note that the aliasRect will still give the correct value of Rec even though
    // it was upcasted because the virtual magic works for method calls on alias
    cout<<"Testing with alias on obj in stack"<<endl;
    printArea(aliasRect);
    printArea(aliasTri);
    cout<<"Area of rec without alais is "<<r.calArea()<<endl;
    cout<<"Area of rec with alais is "<<aliasRect.calArea()<<endl;
    cout<<endl;

    // We can see here that pure upcasting without alias does not work in our favour
    cout<<"Testing by passing with some declared variable type"<<endl;
    Polygon p1 = r;
    Rectangle r1 =r;
    printArea(p1);
    printArea(r1);
    cout<<"Area of rec without alias and upcasted is "<<p1.calArea()<<endl;
    cout<<"Area of rec without alias and no upcast is "<<r1.calArea()<<endl;
    cout<<endl;

    // Finally, if we pass objects by pointers, it will always use dynamic binding
    Rectangle *ptrRect = new Rectangle("rec",5.5,5.5);
    Triangle *ptrTri = new Triangle("rec",5.5,5.5);
    cout<<"Testing with ptr"<<endl;
    printAreaV2(ptrRect);
    printAreaV2(ptrTri);
    delete ptrRect,ptrTri;
}