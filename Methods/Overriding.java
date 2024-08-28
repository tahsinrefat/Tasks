class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}
// notice here override is done by inheriting a class and the child class must have the same class
// with same name, same arguments and same return types. It is runtime

public class MyClass {
    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
    }
}