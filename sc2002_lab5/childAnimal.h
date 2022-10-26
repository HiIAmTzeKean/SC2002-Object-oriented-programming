#include <iostream>
#include <string>
#include "animal.h"

using namespace std;

class Dog : public Mammal {
    public:
        Dog() : Mammal() {
            cout << "Constructing Dog object"<< endl;
        }
        Dog(string name, COLOR color, string owner) : Mammal(name,color),_owner(owner) {
            cout << "Constructing Dog object with name "<< name << endl;
        }
        ~Dog() {
            cout << "Destructing Dog object " << getName() << endl;
        }
        void speak() {
            cout << "Woof" << endl;
        }
        void move() {
            cout << "Dog moves" << endl;
        }
    private:
        string _owner;
};


class Cat : public Mammal {
    public:
        Cat() : Mammal() {
            cout << "Constructing Cat object"<< endl;
        }
        Cat(string name, COLOR color, string owner) : Mammal(name,color),_owner(owner) {
            cout << "Constructing Cat object with name "<< name << endl;
        }
        ~Cat() {
            cout << "Destructing Cat object " << getName() << endl;
        }
        void speak() {
            cout << "Meow" << endl;
        }
        void move() {
            cout << "Cat moves" << endl;
        }
    private:
        string _owner;
};

class Lion : public Mammal {
    public:
        Lion() : Mammal() {
            cout << "Constructing Lion object"<< endl;
        }
        Lion(string name, COLOR color, string owner) : Mammal(name,color),_owner(owner) {
            cout << "Constructing Lion object with name "<< name << endl;
        }
        ~Lion() {
            cout << "Destructing Lion object " << getName() << endl;
        }
        void speak() {
            cout << "Roar" << endl;
        }
        void move() {
            cout << "Lion moves" << endl;
        }
    private:
        string _owner;
};