class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    // name setter function and eat() function is already in this class because this class inherited from Animal class
    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    // name setter function and eat() function is already in this class because this class inherited from Animal class
    void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class MyClass {
  public static void main(String args[]) {
    Animal animal = new Animal();
    animal.setName("Animal");
    animal.eat();
    Dog dog = new Dog();
    dog.setName("Dog");
    dog.eat();
    dog.bark();
    Cat cat = new Cat();
    cat.setName("Cat");
    cat.eat();
    cat.meow();
  }
}