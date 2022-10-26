#include <iostream>
#include <string>
#include "animal.h"
#include "childAnimal.h"

using namespace std;
COLOR convert(string &str) {
    if (str == "Green") return Green;
    return Brown;
}
int main() {
    // Animal a;

    // Question 3
    // Dog dogi("Lassie",White,"Andy");
    // Mammal *aniPtr = &dogi;
    // Mammal &aniRef = dogi;
    // Mammal aniVal = dogi;
    // aniPtr->speak();
    // aniRef.speak();
    // aniVal.speak();

    // Question 4
    int answer, count=0;
    string name, owner, color;
    COLOR convertedColor;
    // Mammal array[3];
    Mammal* array[3];
    
    while(answer!=5) {
        cout << "Select the animal to send to Zoo:" << endl;
        cout << "(1) Dog\n(2) Cat\n(3) Lion\n(4) Move all animals\n(5) Quit" << endl;
        cin >> answer;

        switch (answer)
        {
        case 1:{
            cout<<"Input by (name,color,owner):"<<endl;
            cin>>name>>color>>owner;
            convertedColor = convert(color);
            array[count++] = new Dog(name,convertedColor,owner);
            break;
        }
        case 2:{
            cout<<"Input by (name,color,owner):"<<endl;
            cin>>name>>color>>owner;
            convertedColor = convert(color);
            array[count++] = new Cat(name,convertedColor,owner);
            break;
        }
        case 3:{
            cout<<"Input by (name,color,owner):"<<endl;
            cin>>name>>color>>owner;
            convertedColor = convert(color);
            array[count++] = new Lion(name,convertedColor,owner);
            break;
        }
        case 4:
            for (int i=0; i<count; i++){
                // array[i].move();
                // array[i].speak();
                // array[i].eat();
                array[i]->move();
                array[i]->speak();
                array[i]->eat();
            }
            break;
        default:
            break;
        }
    }
    cout << "Program exiting ..." << endl;
    return 0;
}