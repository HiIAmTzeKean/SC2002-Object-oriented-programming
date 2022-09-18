package sc2002_lecture;

public class Animal {
    // Method overloading performed here
    // Method overloading follows static bindiing
    public void call(Animal o){
        System.out.println("Animal obj");
        o.move();
    }
    public void call(Cat c){
        System.out.println("Subclass obj");
        c.move();
    }

    public void move() {
        System.out.println("Animal move");
    }
    public void move(Cat c) {
        System.out.println("Animal moving is cat");
    }
}
