package AtClass;

public class Class1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal also_dog = new Dog();

        dog.sound();
        cat.sound();
        also_dog.sound();
    }
}

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Gav-gav");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("May-may");
    }
}

