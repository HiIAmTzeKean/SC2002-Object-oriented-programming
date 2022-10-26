#ifndef _ANIMAL

#define _ANIMAL
#include <iostream>
#include <string>

using namespace std;

enum COLOR { Green, Blue, White, Black, Brown};

class Animal {
    public:
        Animal() : _name("unknown") {
            cout << "Constructing Animal object " << _name << endl;
        }
        Animal(string name, COLOR color): _name(name),_color(color) {
            cout << "Constructing Animal object " << _name << endl;
        }
        ~Animal() {
            cout << "Destructing Animal object " << _name << endl;
        }
        virtual void speak() {
            cout << "Animal speaks" << endl;
        }
        virtual void move() =0;
        string getName() {
            return _name;
        }
    private:
        string _name;
        COLOR _color;
};

class Mammal : public Animal {
    public:
    Mammal() : Animal() {
        cout << "Constructing Mammal object "<< endl;
    }
    Mammal(string name, COLOR color): Animal(name,color) {
        cout << "Constructing Mammal object with name "<< name << endl;
    }
    ~Mammal() {
        cout << "Destructing Mammal object " << Animal::getName() << endl;
    }
    void speak() {
        cout << "Mammal speaks" << endl;
    }
    void move() {
            cout << "Animal moves" << endl;
        }
    void eat() const {
        cout << "Mammal eat " << endl;
    }
};
#endif