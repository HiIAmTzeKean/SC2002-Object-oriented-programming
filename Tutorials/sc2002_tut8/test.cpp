#include <iostream>

using namespace std;

class A {
    public: 
        A(string name):_name(name){}
        void func() {
            cout<<"world"<<_name<<endl;
        }
    private:
        string _name;
};

class B : public A{
    public:
        B(string name):A(name){}
        void print(){
            cout<<"printing func"<<endl;
            func();
        }
    private:
        string _name;
};

class C: public B{
    public:
        C(string name):B(name) {
            A::func();
            int x = 1;
        }
    private:
        string _name;
};

int main(){
    C c("hello");
    return 0;
}