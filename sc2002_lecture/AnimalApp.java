package sc2002_lecture;

public class AnimalApp {
    public static void main(String arg[]) {
        Animal boss = new Animal();
        Animal c = new Cat();
        Animal d = new Dog();
        c.move();
        boss.call(c);
    }
}
